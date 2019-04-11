package cn.yukismimi.controller;

import cn.yukismimi.entity.ResponseData;
import cn.yukismimi.entity.User;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@ControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {

        String url = ((ServletServerHttpRequest) request).getServletRequest().getRequestURI();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        Long nowTimestamp = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));

        Optional.ofNullable(response.getHeaders().get("Token"))
             .map(list -> list.get(0))
             .map(token -> token.split("-")[1])
             .map(tokenTime -> LocalDateTime.parse(tokenTime,df))
             .map(tokenTime-> tokenTime.toEpochSecond(ZoneOffset.of("+8")))
             .ifPresent(tokenTimestamp->{
                if(nowTimestamp - tokenTimestamp > 15*60)
                    response.getHeaders().set("Token",response.getHeaders().get("token").get(0).split("-")[0] + "-" + nowTimestamp);
                    response.getHeaders().set("Access-Control-Expose-Headers","Token");
             });


        if( url.equals("/login") && ((ResponseData) body).getCode() == 1) {
            Object data = ((ResponseData) body).getData();
            int id = ((User) data).getId();
            String localTime = df.format(LocalDateTime.now());
            String token = id + "-" + localTime;
            response.getHeaders().set("Token",token);
            response.getHeaders().set("Access-Control-Expose-Headers","Token");
        }

        return body;
    }

}
package cn.yukismimi.intercepter;

import cn.yukismimi.utils.AESUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String url = request.getRequestURI();

        if(url.equals("/login") || url.equals("/register") || url.equals("/admin")){
            return true;
        }

        String token = request.getHeader("token");
        String uid = request.getHeader("uid");

        if(token == null || "".equals(token.trim())){
            response.setStatus(304);
            return false;
        }

        String decryptedToken = AESUtils.decrypt(token,"yukismimi");
        if(!decryptedToken.split("-")[0].equals(uid)) {
            response.setStatus(304);
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

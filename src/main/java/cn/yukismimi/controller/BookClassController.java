package cn.yukismimi.controller;

import cn.yukismimi.entity.BookClass;
import cn.yukismimi.entity.ClassData;
import cn.yukismimi.service.BookClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookClassController {

    @Autowired
    BookClassService bookClassService;

    @GetMapping("bookClass")
    public List<ClassData> findBookClass(){
        return bookClassService.findBookClass();
    }
}

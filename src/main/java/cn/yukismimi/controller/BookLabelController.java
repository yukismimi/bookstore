package cn.yukismimi.controller;

import cn.yukismimi.entity.Book;
import cn.yukismimi.entity.BookLabel;
import cn.yukismimi.service.BookLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookLabelController {

    @Autowired
    private BookLabelService bookLabelService;

    @GetMapping("findBookByLabel")
    public List<Book> findBookByLabel(@RequestParam String label){
        return bookLabelService.findBookByLabel(label);
    }

    @GetMapping("findLabelByBookId")
    public List<String> findLabelByBookId(@RequestParam int bookId){
        return bookLabelService.findLabelByBookId(bookId);
    }

    @PostMapping("bookLabel")
    public int addBookLabel(@RequestBody BookLabel bookLabel){
        return bookLabelService.addBookLabel(bookLabel);
    }

    @DeleteMapping("bookLabel")
    public int removeBookLabel(@RequestParam int bookId,
                               @RequestParam String label){
        BookLabel bookLabel = new BookLabel();
        bookLabel.setBookId(bookId);
        bookLabel.setLabel(label);
        return bookLabelService.removeBookLabel(bookLabel);
    }
}

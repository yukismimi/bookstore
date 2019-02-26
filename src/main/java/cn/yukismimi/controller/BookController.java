package cn.yukismimi.controller;

import cn.yukismimi.entity.Book;
import cn.yukismimi.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("book")
    public Book findBookById(@RequestParam("id") int id){
        return bookService.findBookById(id);
    }

    @PostMapping("book")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @PutMapping("book")
    public void modifyBook(@RequestBody Book book){
        bookService.modifyBook(book);
    }

    @DeleteMapping("book")
    public void removeBookById(@RequestParam("id") int id){
        bookService.removeBookById(id);
    }

    @GetMapping("bookList")
    public List<Book> findBookList(){
        return bookService.findBookList();
    }

}

package cn.yukismimi.controller;

import cn.yukismimi.entity.Book;
import cn.yukismimi.other.Response;
import cn.yukismimi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("book")
    public Book findBookById(@RequestParam int id){
        return bookService.findBookById(id);
    }

    @GetMapping("bookList")
    public List<Book> findBookList(){
        return bookService.findBookList();
    }

    @PostMapping("bookList")
    public List<Book> findBook(@RequestBody Book book){
        return bookService.findBook(book);
    }

    @PostMapping("book")
    public Response<Integer> addBook(@RequestBody Book book){
        int data = bookService.addBook(book);
        Response<Integer> resp = new Response<>();
        resp.setData(data);
        return resp;
    }

    @PutMapping("book")
    public void modifyBook(@RequestBody Book book){
        bookService.modifyBook(book);
    }

    @DeleteMapping("book")
    public void removeBookById(@RequestParam("id") int id) {
        bookService.removeBookById(id);
    }

}

package cn.yukismimi.service;

import cn.yukismimi.entity.Book;

import java.util.List;

public interface BookService {

    int addBook(Book book);

    void removeBookById(int id);

    void modifyBook(Book book);

    Book findBookById(int id);

    List<Book> findBook(Book book);

    List<Book> findBookList();
}

package cn.yukismimi.mapper;

import cn.yukismimi.entity.Book;

import java.util.List;

public interface BookMapper {

    void addBook(Book book);

    void removeBookById(int id);

    void modifyBook(Book book);

    Book findBookById(int id);

    Book findBookByName(String name);

    List<Book> findBookList();
}

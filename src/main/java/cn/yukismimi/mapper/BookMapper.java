package cn.yukismimi.mapper;

import cn.yukismimi.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface BookMapper {

    int addBook(Book book);

    void removeBookById(int id);

    void modifyBook(Book book);

    Book findBookById(int id);

    List<Book> findBook(Book book);

    List<Book> findBookList();
}

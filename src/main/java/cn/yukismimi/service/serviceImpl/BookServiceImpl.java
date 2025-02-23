package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.Book;
import cn.yukismimi.mapper.BookMapper;
import cn.yukismimi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public void removeBookById(int id) {
        bookMapper.removeBookById(id);
    }

    @Override
    public void modifyBook(Book book) {
        bookMapper.modifyBook(book);
    }

    @Override
    public Book findBookById(int id) {
        return bookMapper.findBookById(id);
    }

    @Override
    public List<Book> findBook(Book book) {
        return bookMapper.findBook(book);
    }

    @Override
    public List<Book> findBookList() {
        return bookMapper.findBookList();
    }
}

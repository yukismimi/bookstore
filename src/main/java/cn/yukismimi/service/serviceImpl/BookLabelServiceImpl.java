package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.Book;
import cn.yukismimi.entity.BookLabel;
import cn.yukismimi.mapper.BookLabelMapper;
import cn.yukismimi.mapper.BookMapper;
import cn.yukismimi.service.BookLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("BookLabelService")
public class BookLabelServiceImpl implements BookLabelService {

    @Autowired
    BookLabelMapper bookLabelMapper;

    @Autowired
    BookMapper bookMapper;

    @Override
    public int addBookLabel(BookLabel bookLabel) {
        return bookLabelMapper.addBookLabel(bookLabel);
    }

    @Override
    public int removeBookLabel(BookLabel bookLabel) {
        return bookLabelMapper.removeBookLabel(bookLabel);
    }

    @Override
    public List<String> findLabelByBookId(int bookId) {
        return bookLabelMapper.findLabelByBookId(bookId);
    }

    @Override
    public List<Book> findBookByLabel(String label) {
        return bookLabelMapper.findBookByLabel(label)
                .stream()
                .map(bookMapper::findBookById)
                .collect(Collectors.toList());
    }
}

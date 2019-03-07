package cn.yukismimi.service;

import cn.yukismimi.entity.Book;
import cn.yukismimi.entity.BookLabel;

import java.util.List;

public interface BookLabelService {

    int addBookLabel(BookLabel bookLabel);

    int removeBookLabel(BookLabel bookLabel);

    List<String> findLabelByBookId(int bookId);

    List<Book> findBookByLabel(String label);

}

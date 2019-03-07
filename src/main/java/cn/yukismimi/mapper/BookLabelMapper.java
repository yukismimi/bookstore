package cn.yukismimi.mapper;

import cn.yukismimi.entity.BookLabel;

import java.util.List;

public interface BookLabelMapper {

    int addBookLabel(BookLabel bookLabel);

    int removeBookLabel(BookLabel bookLabel);

    List<String> findLabelByBookId(int bookId);

    List<Integer> findBookByLabel(String label);
}

package cn.yukismimi.mapper;

import cn.yukismimi.entity.BookLabel;

import java.util.List;

public interface BookLabelMapper {

    void addBookLabel(BookLabel bookLabel);

    void removeBookLabelById(int id);

    void modifyBookLabel(BookLabel bookLabel);

    BookLabel findById(int id);

    BookLabel findByName(String name);

    List<BookLabel> findBookLabelList();
}

package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.Book;
import cn.yukismimi.entity.BookClass;
import cn.yukismimi.entity.ClassData;
import cn.yukismimi.mapper.BookClassMapper;
import cn.yukismimi.service.BookClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service("BookClassService")
public class BookClassServiceImpl implements BookClassService {

    @Autowired
    BookClassMapper bookClassMapper;

    @Override
    public List<ClassData> findBookClass() {

        HashMap<Integer,List<BookClass>> map = new HashMap<>();
        List<ClassData> clsDataList = new ArrayList<>();

        bookClassMapper.findBookClass()
                .forEach(i -> {
                    Optional.ofNullable(map.get(i.getClazz()))
                            .ifPresentOrElse(list-> list.add(i), ()->{
                                List<BookClass> list = new ArrayList<>();
                                list.add(i);
                                map.put(i.getClazz(),list);
                                    });
                });
        map.forEach((cls,list) -> {
            ClassData clsData = new ClassData();
            clsData.setClazz(cls);
            clsData.setClassName(list.get(0).getClassName());
            clsData.setClzList(list);
            clsDataList.add(clsData);
        });

        return clsDataList;
    }
}

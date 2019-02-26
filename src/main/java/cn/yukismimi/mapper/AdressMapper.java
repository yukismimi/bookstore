package cn.yukismimi.mapper;

import cn.yukismimi.entity.Adress;

import java.util.List;

public interface AdressMapper {

    void addAdress(Adress adress);

    void removeAdressById(int id);

    void modifyAdress(Adress adress);

    Adress findById(int id);

    Adress findByName(String name);

    List<Adress> findAdressList();
}

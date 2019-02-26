package cn.yukismimi.service;

import cn.yukismimi.entity.Adress;

import java.util.List;

public interface AdressService {

    void addAdress(Adress adress);

    void removeAdressById(int id);

    void modifyAdress(Adress adress);

    Adress findById(int id);

    Adress findByName(String name);

    List<Adress> findAdressList();
}

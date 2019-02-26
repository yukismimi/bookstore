package cn.yukismimi.service;

import cn.yukismimi.entity.Favourite;

import java.util.List;

public interface FavouriteService {

    void addFavourite(Favourite favourite);

    void removeFavouriteById(int id);

    void modifyFavourite(Favourite favourite);

    Favourite findById(int id);

    Favourite findByName(String name);

    List<Favourite> findFavouriteList();
}

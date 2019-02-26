package cn.yukismimi.mapper;

import cn.yukismimi.entity.Favourite;

import java.util.List;

public interface FavouriteMapper {

    void addFavourite(Favourite favourite);

    void removeFavouriteById(int id);

    void modifyFavourite(Favourite favourite);

    Favourite findById(int id);

    Favourite findByName(String name);

    List<Favourite> findFavouriteList();
}

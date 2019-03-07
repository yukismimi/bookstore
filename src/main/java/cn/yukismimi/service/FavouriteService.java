package cn.yukismimi.service;

import cn.yukismimi.entity.Favourite;

import java.util.List;

public interface FavouriteService {

    int addFavourite(Favourite favourite);

    int removeFavouriteById(String favId);

    List<Favourite> findFavouriteList(int userId);
}

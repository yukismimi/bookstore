package cn.yukismimi.mapper;

import cn.yukismimi.entity.Favourite;

import java.util.List;

public interface FavouriteMapper {

    int addFavourite(Favourite favourite);

    int removeFavouriteById(String favId);

    List<Favourite> findFavouriteList(int userId);
}

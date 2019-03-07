package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.Favourite;
import cn.yukismimi.mapper.FavouriteMapper;
import cn.yukismimi.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service("favouriteService")
public class FavouriteServiceImpl implements FavouriteService {

    @Autowired
    FavouriteMapper favouriteMapper;

    @Override
    public int addFavourite(Favourite favourite) {
        StringBuilder sb = new StringBuilder();
        String favId = sb.append(favourite.getUserId())
                .append("-")
                .append(favourite.getBookId())
                .toString();
        favourite.setFavId(favId);
        favourite.setAddTime(LocalDateTime.now());

        return favouriteMapper.addFavourite(favourite);
    }

    @Override
    public int removeFavouriteById(String favId) {
        favId = Optional.ofNullable(favId)
                .orElse("");
        return favouriteMapper.removeFavouriteById(favId);
    }

    @Override
    public List<Favourite> findFavouriteList(int userId) {
        return favouriteMapper.findFavouriteList(userId);
    }
}

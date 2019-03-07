package cn.yukismimi.controller;

import cn.yukismimi.entity.Favourite;
import cn.yukismimi.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FavouriteController {

    @Autowired
    FavouriteService favouriteService;

    @GetMapping("favouriteList")
    public List<Favourite> findFavouriteList(@RequestParam int userId){
        return favouriteService.findFavouriteList(userId);
    }

    @PostMapping("favourite")
    public int addFavourite(@RequestBody Favourite favourite){
        return favouriteService.addFavourite(favourite);
    }

    @DeleteMapping("favourite")
    public int removeFavouriteById(@RequestParam String favId){
        return favouriteService.removeFavouriteById(favId);
    }

}

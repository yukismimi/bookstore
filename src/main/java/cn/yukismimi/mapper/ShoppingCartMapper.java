package cn.yukismimi.mapper;

import cn.yukismimi.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartMapper {

    void addShoppingCart(ShoppingCart shoppingCart);

    void removeShoppingCartById(int id);

    void modifyShoppingCart(ShoppingCart shoppingCart);

    ShoppingCart findById(int id);

    ShoppingCart findByName(String name);

    List<ShoppingCart> findShoppingCartList();
}

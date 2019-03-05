package cn.yukismimi.mapper;

import cn.yukismimi.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartMapper {

    int addItemToShoppingCart(ShoppingCart shoppingCart);

    int removeItemFromShoppingCart(ShoppingCart shoppingCart);

    int removeAllFromShoppingCart(int userId);

    int modifyItemInShoppingCart(ShoppingCart shoppingCart);

    List<ShoppingCart> findShoppingCartList(int userId);
}

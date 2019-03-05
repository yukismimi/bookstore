package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.ShoppingCart;
import cn.yukismimi.mapper.ShoppingCartMapper;
import cn.yukismimi.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    ShoppingCartMapper shoppingCartMapper;

    @Override
    public int addItemToShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartMapper.addItemToShoppingCart(shoppingCart);
    }

    @Override
    public int removeItemFromShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartMapper.removeItemFromShoppingCart(shoppingCart);
    }

    @Override
    public int removeAllFromShoppingCart(int userId) {
        return shoppingCartMapper.removeAllFromShoppingCart(userId);
    }

    @Override
    public int modifyItemInShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartMapper.modifyItemInShoppingCart(shoppingCart);
    }

    @Override
    public List<ShoppingCart> findShoppingCartList(int userId) {
        return shoppingCartMapper.findShoppingCartList(userId);
    }
}

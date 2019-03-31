package cn.yukismimi.service.serviceImpl;

import cn.yukismimi.entity.ShoppingCart;
import cn.yukismimi.mapper.BookMapper;
import cn.yukismimi.mapper.ShoppingCartMapper;
import cn.yukismimi.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    ShoppingCartMapper shoppingCartMapper;
    @Autowired
    BookMapper bookMapper;

    @Override
    public int addItemToShoppingCart(ShoppingCart shoppingCart) {
        List<ShoppingCart> sc = Optional.ofNullable(shoppingCart.getUserId())
                .map(shoppingCartMapper::findShoppingCartList)
                .get()
                .stream()
                .filter(i -> i.getBookId()==shoppingCart.getBookId())
                .collect(Collectors.toList());

        Optional.ofNullable(sc.size()==0 ? null : sc.get(0))
                .ifPresent(i -> {
                    removeItemFromShoppingCart(shoppingCart);
                    shoppingCart.setAmount(shoppingCart.getAmount() + i.getAmount());
                });

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
        List<ShoppingCart> list = shoppingCartMapper.findShoppingCartList(userId);
        list.stream()
                .forEach(i -> {i.setBookInfo(bookMapper.findBookById(i.getBookId()));});
        return list;
    }
}

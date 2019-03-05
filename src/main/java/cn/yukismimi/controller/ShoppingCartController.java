package cn.yukismimi.controller;

import cn.yukismimi.entity.ShoppingCart;
import cn.yukismimi.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;

    @GetMapping("shoppingCart")
    public List<ShoppingCart> findShoppingCartList(@RequestParam int userId){
        return shoppingCartService.findShoppingCartList(userId);
    }

    @PutMapping("shoppingCart")
    public int modifyItemInShoppingCart(@RequestParam int userId,
                                        @RequestParam int bookId,
                                        @RequestParam int amount){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setUserId(userId);
        shoppingCart.setBookId(bookId);
        shoppingCart.setAmount(amount);
        return shoppingCartService.modifyItemInShoppingCart(shoppingCart);
    }

    @DeleteMapping("shoppingCart")
    public int removeItemFromShoppingCart(@RequestParam int userId,
                                          @RequestParam int bookId){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setUserId(userId);
        shoppingCart.setBookId(bookId);
        return shoppingCartService.removeItemFromShoppingCart(shoppingCart);
    }

    @DeleteMapping("removeAllShoppingCart")
    public int removeAllFromShoppingCart(@RequestParam int userId){
        return shoppingCartService.removeAllFromShoppingCart(userId);
    }

    @PostMapping("shoppingCart")
    public int addItemToShoppingCart(@RequestBody ShoppingCart shoppingCart){
        return shoppingCartService.addItemToShoppingCart(shoppingCart);
    }


}

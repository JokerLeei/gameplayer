package com.joker.service.impl;

import com.joker.dao.CartMapper;
import com.joker.entity.Cart;
import com.joker.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.ArrayList;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartMapper cartMapper;

    @Override
    public ArrayList<Cart> showCart(Integer cartUserid) {
        return cartMapper.showCartPro(cartUserid);
    }

    @Override
    public int insertCart(String cartName, String cartImg, BigDecimal cartPrice,
                          Integer cartUserid, Integer cartGameid) {
        return cartMapper.insertCartPro(cartName,cartImg,cartPrice,cartUserid,cartGameid);
    }

    @Override
    public int deleteCart(Integer cartId,Integer cartUserid) {
        return cartMapper.deleteCartPro(cartId,cartUserid);
    }

    @Override
    public Cart buyBol(Integer cartGameid, Integer cartUserid) {
        return cartMapper.buyBolPro(cartGameid,cartUserid);
    }

    @Override
    public int deleteCartToOrder(Integer cartGameid, Integer cartUserid) {
        return cartMapper.deleteCartToOrderPro(cartGameid,cartUserid);
    }

    @Override
    public Cart showCartTo(Integer cartGameid, Integer cartUserid) {
        return cartMapper.showCartToPro(cartGameid,cartUserid);
    }
}

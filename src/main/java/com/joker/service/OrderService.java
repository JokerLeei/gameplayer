package com.joker.service;

import com.joker.entity.Order;
import com.joker.entity.OrderAndUser;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface OrderService {

    ArrayList<OrderAndUser> showOrder(Integer orderUserid);


    int deleteOrder(Integer orderId);

    ArrayList<OrderAndUser> orderNorepeat(Integer orderUserid);

    ArrayList<Order> showAllorder();

    ArrayList<Order> showLike(String orderName);


    void updateBol(Integer gameid,Integer userid);

    int insertOrder(String cartName, BigDecimal cartPrice, Integer cartGameid,
                    Integer cartUserid);

    void deleteOrderTwo(Integer gameId, Integer userId);

    Order showBuyStatus(Integer orderGameid, Integer orderUserid);
}

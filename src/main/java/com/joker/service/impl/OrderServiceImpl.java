package com.joker.service.impl;

import com.joker.dao.GameMapper;
import com.joker.dao.OrderMapper;
import com.joker.entity.Order;
import com.joker.entity.OrderAndUser;
import com.joker.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    GameMapper gameMapper;

    @Override
    public ArrayList<OrderAndUser> showOrder(Integer orderUserid) {
        return orderMapper.showOrderPro(orderUserid);
    }

    @Override
    public int deleteOrder(Integer orderId) {
        return orderMapper.deleteOrderPro(orderId);
    }

    @Override
    public ArrayList<OrderAndUser> orderNorepeat(Integer orderUserid) {
        return orderMapper.orderNorepeatPro(orderUserid);
    }

    @Override
    public ArrayList<Order> showAllorder() {
        return orderMapper.showAllorderPro();
    }

    @Override
    public ArrayList<Order> showLike(String orderName) {
        return orderMapper.showLikePro(orderName);
    }

    @Override
    public void updateBol(Integer gameid,Integer userid) {
        orderMapper.updateBolPro(gameid,userid);
    }

    @Override
    public int insertOrder(String cartName, BigDecimal cartPrice, Integer cartGameid,
                           Integer cartUserid) {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("订单创建时间：" + dateFormat.format(date));
        String orderTime =  dateFormat.format(date);
        return orderMapper.insertOrderPro(cartName,cartPrice,orderTime,cartGameid,cartUserid);
    }

    @Override
    public void deleteOrderTwo(Integer gameId, Integer userId) {
        orderMapper.deleteOrderTwoPro(gameId,userId);
    }

    @Override
    public Order showBuyStatus(Integer orderGameid, Integer orderUserid) {
        return orderMapper.showBuyStatusPro(orderGameid,orderUserid);
    }
}

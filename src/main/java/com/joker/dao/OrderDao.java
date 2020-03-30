package com.joker.dao;

import com.joker.entity.Order;
import com.joker.entity.OrderAndUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;

@Repository
public interface OrderDao {

    ArrayList<OrderAndUser> showOrderPro(@Param("orderUserid") Integer orderUserid);

    int insertOrderPro(@Param("cartName") String cartName,
                       @Param("cartPrice") BigDecimal cartPrice,
                       @Param("orderTime") String orderTime,
                       @Param("cartGameid") Integer cartGameid,
                       @Param("cartUserid") Integer cartUserid);

    int deleteOrderPro(@Param("orderId") Integer orderId);

    ArrayList<OrderAndUser> orderNorepeatPro(Integer orderUserid);

    ArrayList<Order> showAllorderPro();

    ArrayList<Order> showLikePro(@Param("orderName") String orderName);

    void updateBolPro(@Param("gameid") Integer gameid,
                      @Param("userid") Integer userid);

    void updateName(@Param("gameId") Integer gameId,
                    @Param("gameName") String gameName);

    void deleteOrderTwoPro(@Param("gameId") Integer gameId,
                           @Param("userId") Integer userId);

    Order showBuyStatusPro(@Param("orderGameid") Integer orderGameid,
                         @Param("orderUserid") Integer orderUserid);
}

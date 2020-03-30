package com.joker.dao;

import com.joker.entity.Cart;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;

@Repository
public interface CartDao {
    ArrayList<Cart> showCartPro(@Param("cartUserid") Integer cartUserid);

    int insertCartPro(@Param("cartName") String cartName,
                      @Param("cartImg") String cartImg,
                      @Param("cartPrice") BigDecimal cartPrice,
                      @Param("cartUserid") Integer cartUserid,
                      @Param("cartGameid") Integer cartGameid);

    int deleteCartPro(@Param("cartId") Integer cartId,
                      @Param("cartUserid") Integer cartUserid);

    Cart buyBolPro(@Param("cartGameid") Integer cartGameid,
                   @Param("cartUserid") Integer cartUserid);

    int deleteCartToOrderPro(@Param("cartGameid") Integer cartGameid,
                             @Param("cartUserid") Integer cartUserid);

    Cart showCartToPro(@Param("cartGameid") Integer cartGameid,
                       @Param("cartUserid") Integer cartUserid);
}

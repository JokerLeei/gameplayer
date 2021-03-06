package com.joker.dao;

import com.joker.entity.Game;
import com.joker.entity.GameSale;
import com.joker.entity.Order;
import com.joker.entity.Sort;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.ArrayList;

@Mapper
public interface GameMapper {
    ArrayList<Game> showGamePro();

    int insertGamePro(@Param("gameName") String gameName,
                      @Param("gamePrice") BigDecimal gamePrice,
                      @Param("gameDescription") String gameDescription,
                      @Param("gameDiscount") BigDecimal gameDiscount,
                      @Param("gamePromotion") Boolean gamePromotion,
                      @Param("gameCharacter") String gameCharacter,
                      @Param("gameImg") String gameImg,
                      @Param("gameDown") String gameDown,
                      @Param("gameSale") Integer gameSale,
                      @Param("gameTime") String gameTime);

    int deleteGamePro(@Param("gameId") Integer gameId);

    int updateGamePro(@Param("gameName") String gameName,
                      @Param("gamePrice") BigDecimal gamePrice,
                      @Param("gameDescription") String gameDescription,
                      @Param("gameDiscount") BigDecimal gameDiscount,
                      @Param("gamePromotion") Boolean gamePromotion,
                      @Param("gameCharacter") String gameCharacter,
                      @Param("gameImg") String gameImg,
                      @Param("gameId") Integer gameId,
                      @Param("gameDown") String gameDown);

    ArrayList<Game> showLikePro(@Param("gameName") String gameName);

    ArrayList<Sort> getSortPro();

    ArrayList<GameSale> getSalePro();

    Game showOneGamePro(@Param("gameName")String gameName);

    Game showIdgamePro(@Param("gameId") Integer gameId);

    ArrayList<Game> showBlockPro();

    ArrayList<Game> showSalePro();

    ArrayList<Game> showNewgamePro();

    ArrayList<Game> showSortgamePro(@Param("gameCharacter") String gameCharacter);

    void updateCartmsg(@Param("gameName") String gameName,
                       @Param("price") BigDecimal price,
                       @Param("gameImg") String gameImg,
                       @Param("gameId") Integer gameId);

    void updateCollectmsg(@Param("gameName") String gameName,
                          @Param("price") BigDecimal price,
                          @Param("gameImg") String gameImg,
                          @Param("gameId") Integer gameId);

    Game duplicatePro(@Param("gameName") String gameName);

    void addSortcount(@Param("gameCharacter") String gameCharacter);

    void updateSort(@Param("gameCharacter") String gameCharacter);

    ArrayList<Order>  selOrder(@Param("gameId") Integer gameId);

    void updateSale(@Param("gameId") Integer gameId);

    /**
     * 若修改商品分类，更新分类的数量
     */
    void updateSortOnePro(@Param("dec") String dec);

    void updateSortTwoPro(@Param("gameCharacter") String gameCharacter);

}

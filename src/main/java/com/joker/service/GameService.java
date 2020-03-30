package com.joker.service;

import com.joker.entity.Game;
import com.joker.entity.GameSale;
import com.joker.entity.Sort;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface GameService {

    ArrayList<Game> showGame();

    int insertGame(String gameName, BigDecimal gamePrice, String gameDescription, BigDecimal gameDiscount,
                   Boolean gamePromotion, String gameCharacter,String gameImg,String gameDown,Integer gameSale);

    int deleteGame(Integer gameId);

    int updateGame(String gameName, BigDecimal gamePrice, String gameDescription,
                   BigDecimal gameDiscount, Boolean gamePromotion, String gameCharacter,
                   String gameImg,Integer gameId,String gameDown);

    ArrayList<Game> showLike(String gameName);

    ArrayList<Sort> getSort();

    ArrayList<GameSale> getSale();

    Game showOneGame(String gameName);

    Game showIdgame(Integer gameId);

    ArrayList<Game> showBlock();

    ArrayList<Game> showSale();

    ArrayList<Game> showNewgame();

    ArrayList<Game> showSortgame(String gameCharacter);

    Game duplicate(String gameName);

    void updateSale(Integer gameId);
}

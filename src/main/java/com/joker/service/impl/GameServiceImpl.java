package com.joker.service.impl;

import com.joker.dao.GameMapper;
import com.joker.dao.OrderMapper;
import com.joker.entity.Game;
import com.joker.entity.GameSale;
import com.joker.entity.Order;
import com.joker.entity.Sort;
import com.joker.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public ArrayList<Game> showGame() {
        return gameMapper.showGamePro();
    }

    @Override
    public int insertGame(String gameName, BigDecimal gamePrice, String gameDescription, BigDecimal gameDiscount,
                          Boolean gamePromotion, String gameCharacter, String gameImg, String gameDown,Integer gameSale) {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("游戏创建时间：" + dateFormat.format(date));
        String gameTime =  dateFormat.format(date);
        gameMapper.addSortcount(gameCharacter);
        return gameMapper.insertGamePro(gameName,gamePrice,gameDescription,gameDiscount,
                gamePromotion,gameCharacter,gameImg,gameDown,gameSale,gameTime);
    }

    @Override
    public int deleteGame(Integer gameId) {
        Game g = gameMapper.showIdgamePro(gameId);
        gameMapper.updateSort(g.getGameCharacter());
        return gameMapper.deleteGamePro(gameId);
    }

    @Override
    public int updateGame(String gameName, BigDecimal gamePrice, String gameDescription,
                          BigDecimal gameDiscount, Boolean gamePromotion, String gameCharacter,
                          String gameImg, Integer gameId, String gameDown) {
        BigDecimal price = gamePrice.multiply(gameDiscount);
        ArrayList<Order> o = gameMapper.selOrder(gameId);
        Game g = gameMapper.showOneGamePro(gameName);
        String dec = g.getGameCharacter();
        if(dec != gameCharacter){
            gameMapper.updateSortOnePro(dec);
            gameMapper.updateSortTwoPro(gameCharacter);
        }
        gameMapper.updateCartmsg(gameName,price,gameImg,gameId);
        gameMapper.updateCollectmsg(gameName,price,gameImg,gameId);
        if(o != null) {
            orderMapper.updateName(gameId,gameName);
        }
        return gameMapper.updateGamePro(gameName,gamePrice,gameDescription,gameDiscount,
                gamePromotion,gameCharacter,gameImg,gameId,gameDown);
    }

    @Override
    public ArrayList<Game> showLike(String gameName) {
        return gameMapper.showLikePro(gameName);
    }

    @Override
    public ArrayList<Sort> getSort() {
        ArrayList<Sort> getsort = gameMapper.getSortPro();
        return getsort;
    }

    @Override
    public ArrayList<GameSale> getSale() {
        ArrayList<GameSale> getsale = gameMapper.getSalePro();
        return getsale;
    }

    @Override
    public Game showOneGame(String gameName) {
        return gameMapper.showOneGamePro(gameName);
    }

    @Override
    public Game showIdgame(Integer gameId) {
        return gameMapper.showIdgamePro(gameId);
    }

    @Override
    public ArrayList<Game> showBlock() {
        return gameMapper.showBlockPro();
    }

    @Override
    public ArrayList<Game> showSale() {
        return gameMapper.showSalePro();
    }

    @Override
    public ArrayList<Game> showNewgame() {
        return gameMapper.showNewgamePro();
    }

    @Override
    public ArrayList<Game> showSortgame(String gameCharacter) {
        return gameMapper.showSortgamePro(gameCharacter);
    }

    @Override
    public Game duplicate(String gameName) {
        return gameMapper.duplicatePro(gameName);
    }

    @Override
    public void updateSale(Integer gameId) {
        gameMapper.updateSale(gameId);
    }

}

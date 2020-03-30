package com.joker.service.impl;

import com.joker.dao.CollectionMapper;
import com.joker.entity.Collection;
import com.joker.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;

@Service
public class CollectionServiceImpl implements CollectionService {

    @Autowired
    CollectionMapper collectionMapper;

    @Override
    public ArrayList<Collection> showCollection(Integer collectionUserid) {
        return collectionMapper.showCollectionPro(collectionUserid);
    }

    @Override
    public int insertCollection(String collectionName, BigDecimal collectionPrice, String collectionImg,
                                Integer collectionGameid, Integer collectionUserid) {
        return collectionMapper.insertCollectionPro(collectionName,collectionPrice,
                collectionImg,collectionGameid,collectionUserid);
    }

    @Override
    public int deleteCollection(Integer collectionGameid, Integer collectionUserid) {
        return collectionMapper.deleteCollectionPro(collectionGameid,collectionUserid);
    }

    @Override
    public Collection showCollect(Integer collectionGameid, Integer collectionUserid) {
        return collectionMapper.showCollectPro(collectionGameid,collectionUserid);
    }

    @Override
    public int deleteCollect(String collectionName, Integer collectionUserid) {
        return collectionMapper.deleteCollect(collectionName,collectionUserid);
    }
}

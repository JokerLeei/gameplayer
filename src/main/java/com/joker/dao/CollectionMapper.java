package com.joker.dao;

import com.joker.entity.Collection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.ArrayList;

@Mapper
public interface CollectionMapper {

    ArrayList<Collection> showCollectionPro(@Param("collectionUserid") Integer collectionUserid);

    int insertCollectionPro(@Param("collectionName") String collectionName,
                            @Param("collectionPrice") BigDecimal collectionPrice,
                            @Param("collectionImg") String collectionImg,
                            @Param("collectionGameid") Integer collectionGameid,
                            @Param("collectionUserid") Integer collectionUserid);

    int deleteCollectionPro(@Param("collectionGameid") Integer collectionGameid,
                            @Param("collectionUserid") Integer collectionUserid);

    Collection showCollectPro(@Param("collectionGameid") Integer collectionGameid,
                              @Param("collectionUserid") Integer collectionUserid);

    int deleteCollect(@Param("collectionName") String collectionName,
                      @Param("collectionUserid") Integer collectionUserid);
}

package com.joker.dao;

import com.joker.entity.PUthumb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ThumbMapper {

    PUthumb puThumbolPro(@Param("puthumbPostid") Integer puthumbPostid,
                       @Param("puthumbUserid") Integer puthumbUserid);

    int addThumbPro(@Param("puthumbPostid") Integer puthumbPostid,
                    @Param("puthumbUserid") Integer puthumbUserid);

    void updateThumbPro(@Param("puthumbPostid") Integer puthumbPostid);

}

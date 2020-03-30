package com.joker.dao;

import com.joker.entity.PUthumb;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ThumbDao {

    PUthumb puThumbolPro(@Param("puthumbPostid") Integer puthumbPostid,
                       @Param("puthumbUserid") Integer puthumbUserid);

    int addThumbPro(@Param("puthumbPostid") Integer puthumbPostid,
                    @Param("puthumbUserid") Integer puthumbUserid);

    void updateThumbPro(@Param("puthumbPostid") Integer puthumbPostid);

}

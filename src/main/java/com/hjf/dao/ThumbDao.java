package com.hjf.dao;

import com.hjf.entity.PUthumb;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface ThumbDao {

    PUthumb puThumbolPro(@Param("puthumbPostid") Integer puthumbPostid,
                       @Param("puthumbUserid") Integer puthumbUserid);

    int addThumbPro(@Param("puthumbPostid") Integer puthumbPostid,
                    @Param("puthumbUserid") Integer puthumbUserid);

    void updateThumbPro(@Param("puthumbPostid") Integer puthumbPostid);

}

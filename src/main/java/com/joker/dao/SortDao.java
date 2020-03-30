package com.joker.dao;

import com.joker.entity.Sort;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SortDao {
    ArrayList<Sort> showSortPro();

    int insertSortPro(@Param("sortName") String sortName,
                      @Param("sortCount") Integer sortCount);

    int deleteSort(@Param("sortId") Integer sortId);
}

package com.joker.dao;

import com.joker.entity.Sort;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface SortMapper {
    ArrayList<Sort> showSortPro();

    int insertSortPro(@Param("sortName") String sortName,
                      @Param("sortCount") Integer sortCount);

    int deleteSort(@Param("sortId") Integer sortId);
}

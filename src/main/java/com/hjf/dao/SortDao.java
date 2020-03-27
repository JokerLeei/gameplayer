package com.hjf.dao;

import com.hjf.entity.Sort;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Repository
public interface SortDao {
    ArrayList<Sort> showSortPro();

    int insertSortPro(@Param("sortName") String sortName,
                      @Param("sortCount") Integer sortCount);

    int deleteSort(@Param("sortId") Integer sortId);
}

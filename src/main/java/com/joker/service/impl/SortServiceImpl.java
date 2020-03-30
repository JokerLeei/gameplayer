package com.joker.service.impl;

import com.joker.dao.SortDao;
import com.joker.entity.Sort;
import com.joker.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SortServiceImpl implements SortService {

    @Autowired
    private SortDao sortDao;

    @Override
    public ArrayList<Sort> showSort() {
        return sortDao.showSortPro();
    }

    @Override
    public int insertSort(String sortName,Integer sortCount) {
        return sortDao.insertSortPro(sortName,sortCount);
    }

    @Override
    public int deleteSort(Integer sortId) {
        return sortDao.deleteSort(sortId);
    }
}

package com.joker.service.impl;

import com.joker.dao.SortMapper;
import com.joker.entity.Sort;
import com.joker.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SortServiceImpl implements SortService {

    @Autowired
    private SortMapper sortMapper;

    @Override
    public ArrayList<Sort> showSort() {
        return sortMapper.showSortPro();
    }

    @Override
    public int insertSort(String sortName,Integer sortCount) {
        return sortMapper.insertSortPro(sortName,sortCount);
    }

    @Override
    public int deleteSort(Integer sortId) {
        return sortMapper.deleteSort(sortId);
    }
}

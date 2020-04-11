package com.joker.service.impl;

import com.joker.dao.ThumbMapper;
import com.joker.entity.PUthumb;
import com.joker.service.ThumbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThumbServiceImpl implements ThumbService {

    @Autowired
    private ThumbMapper thumbMapper;

    @Override
    public PUthumb puThumbol(Integer puthumbPostid, Integer puthumbUserid) {
        return thumbMapper.puThumbolPro(puthumbPostid,puthumbUserid);
    }

    @Override
    public int addThumb(Integer puthumbPostid, Integer puthumbUserid) {
        int bol = thumbMapper.addThumbPro(puthumbPostid,puthumbUserid);
        if(bol!=0) {
            thumbMapper.updateThumbPro(puthumbPostid);
            return bol;
        }else {
            return bol;
        }
    }

}

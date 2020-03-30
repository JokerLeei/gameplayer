package com.joker.service.impl;

import com.joker.dao.ThumbDao;
import com.joker.entity.PUthumb;
import com.joker.service.ThumbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThumbServiceImpl implements ThumbService {

    @Autowired
    private ThumbDao thumbDao;

    @Override
    public PUthumb puThumbol(Integer puthumbPostid, Integer puthumbUserid) {
        return thumbDao.puThumbolPro(puthumbPostid,puthumbUserid);
    }

    @Override
    public int addThumb(Integer puthumbPostid, Integer puthumbUserid) {
        int bol = thumbDao.addThumbPro(puthumbPostid,puthumbUserid);
        if(bol!=0) {
            thumbDao.updateThumbPro(puthumbPostid);
            return bol;
        }else {
            return bol;
        }
    }

}

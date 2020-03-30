package com.joker.service;

import com.joker.entity.PUthumb;

public interface ThumbService {

    PUthumb puThumbol(Integer puthumbPostid, Integer puthumbUserid);

    int addThumb(Integer puthumbPostid, Integer puthumbUserid);

}

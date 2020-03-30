package com.joker.service.impl;

import com.joker.dao.PostMapper;
import com.joker.entity.CommentAndUser;
import com.joker.entity.Post;
import com.joker.entity.PostAndUser;
import com.joker.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Override
    public ArrayList<Post> showAllpost() {
        return postMapper.showAllpostPro();
    }

    @Override
    public int insertPost(String postTitle, String postContent, Integer postThumbs,
                          Integer postUserid, String postUsername, Integer postCommons ) {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("用户创建时间：" + dateFormat.format(date));
        String postTime =  dateFormat.format(date);
        return postMapper.insertPostPro(postTitle,postContent,postTime,postThumbs,postUserid,postUsername,postCommons);
    }

    @Override
    public int deletePost(Integer postId) {
        return postMapper.deletePostPro(postId);
    }

    @Override
    public ArrayList<Post> showPost(Integer postUserid) {
        return postMapper.showPostPro(postUserid);
    }

    @Override
    public ArrayList<PostAndUser> showNowpost() {
        return postMapper.showNowpostPro();
    }

    @Override
    public ArrayList<PostAndUser> showHotpost() {
        return postMapper.showHotpostPro();
    }

    @Override
    public PostAndUser showPostdetail(Integer postId) {
        return postMapper.showPostdetailPro(postId);
    }

    @Override
    public ArrayList<CommentAndUser> showPostcommon(Integer commentPostid) {
        return postMapper.showPostcommonPro(commentPostid);
    }

    @Override
    public ArrayList<Post> showLike(String postTitle) {
        return postMapper.showLikePro(postTitle);
    }


}

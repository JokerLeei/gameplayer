package com.joker.dao;

import com.joker.entity.CommentAndUser;
import com.joker.entity.Post;
import com.joker.entity.PostAndUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface PostMapper {
    ArrayList<Post> showAllpostPro();

    int insertPostPro(@Param("postTitle") String postTitle,
                      @Param("postContent") String postContent,
                      @Param("postTime") String postTime,
                      @Param("postThumbs") Integer postThumbs,
                      @Param("postUserid") Integer postUserid,
                      @Param("postUsername") String postUsername,
                      @Param("postCommons") Integer postCommons);

    int deletePostPro(@Param("postId") Integer postId);

    ArrayList<Post> showPostPro(@Param("postUserid") Integer postUserid);

    ArrayList<PostAndUser> showNowpostPro();

    ArrayList<PostAndUser> showHotpostPro();

    PostAndUser showPostdetailPro(@Param("postId") Integer postId);

    ArrayList<CommentAndUser> showPostcommonPro(@Param("commentPostid") Integer commentPostid);


    ArrayList<Post> showLikePro(@Param("postTitle") String postTitle);
}

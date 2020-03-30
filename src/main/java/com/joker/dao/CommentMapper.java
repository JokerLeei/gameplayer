package com.joker.dao;

import com.joker.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface CommentMapper {
    ArrayList<Comment> showAllcommentPro();

    int deleteCommentPro(@Param("commentId") Integer commentId);

    ArrayList<Comment> showCommentPro(@Param("commentUserid") Integer commentUserid);

    int insertCommentPro(@Param("commentPostname") String commentPostname,
                         @Param("commentUserimg") String commentUserimg,
                         @Param("commentContent") String commentContent,
                         @Param("commentUserid") Integer commentUserid,
                         @Param("commentPostid") Integer commentPostid);

    void updateCommonsPro(@Param("commentPostid") Integer commentPostid);

    Comment getPost(@Param("commentId") Integer commentId);

    void updatePostommons(@Param("commentPostid") Integer commentPostid);

    ArrayList<Comment> showLikePro(@Param("commentPostname") String commentPostname);
}

package com.joker.service.impl;

import com.joker.dao.CommentMapper;
import com.joker.entity.Comment;
import com.joker.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public ArrayList<Comment> showAllcomment() {
        return commentMapper.showAllcommentPro();
    }

    @Override
    public int deleteComment(Integer commentId) {
        Comment c= commentMapper.getPost(commentId);
        if(c != null){
        commentMapper.updatePostommons(c.getCommentPostid());
        }
        return commentMapper.deleteCommentPro(commentId);
    }

    @Override
    public ArrayList<Comment> showComment(Integer commentUserid) {
        return commentMapper.showCommentPro(commentUserid);
    }

    @Override
    public int insertComment(String commentPostname, String commentUserimg,
                             String commentContent, Integer commentUserid, Integer commentPostid) {
        int bol = commentMapper.insertCommentPro(commentPostname,commentUserimg,
                commentContent,commentUserid,commentPostid);
        if(bol!=0) {
            commentMapper.updateCommonsPro(commentPostid);
            return bol;
        }else {
            return bol;
        }
    }

    @Override
    public ArrayList<Comment> showLike(String commentPostname) {
        return commentMapper.showLikePro(commentPostname);
    }
}

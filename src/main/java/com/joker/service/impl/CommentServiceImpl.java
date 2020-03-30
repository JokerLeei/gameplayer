package com.joker.service.impl;

import com.joker.dao.CommentDao;
import com.joker.entity.Comment;
import com.joker.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public ArrayList<Comment> showAllcomment() {
        return commentDao.showAllcommentPro();
    }

    @Override
    public int deleteComment(Integer commentId) {
        Comment c= commentDao.getPost(commentId);
        if(c != null){
        commentDao.updatePostommons(c.getCommentPostid());
        }
        return commentDao.deleteCommentPro(commentId);
    }

    @Override
    public ArrayList<Comment> showComment(Integer commentUserid) {
        return commentDao.showCommentPro(commentUserid);
    }

    @Override
    public int insertComment(String commentPostname, String commentUserimg,
                             String commentContent, Integer commentUserid, Integer commentPostid) {
        int bol = commentDao.insertCommentPro(commentPostname,commentUserimg,
                commentContent,commentUserid,commentPostid);
        if(bol!=0) {
            commentDao.updateCommonsPro(commentPostid);
            return bol;
        }else {
            return bol;
        }
    }

    @Override
    public ArrayList<Comment> showLike(String commentPostname) {
        return commentDao.showLikePro(commentPostname);
    }
}

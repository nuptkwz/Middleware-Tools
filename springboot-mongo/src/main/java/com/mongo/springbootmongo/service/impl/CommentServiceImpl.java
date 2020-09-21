package com.mongo.springbootmongo.service.impl;

import com.mongo.springbootmongo.dao.CommentRepository;
import com.mongo.springbootmongo.entity.Comment;
import com.mongo.springbootmongo.service.CommentService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

/**
 * Description
 * Date 2020/9/21 22:56
 * Created by kwz
 */
public class CommentServiceImpl implements CommentService {

    @Setter(onMethod_ = @Autowired)
    private CommentRepository commentRepository;

    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void updateComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void deleteCommentById(String id) {//调用
        commentRepository.deleteById(id);
    }

    @Override
    public List<Comment> findCommentList() {//调用
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comment> findCommentById(String id) {//调用
        return commentRepository.findById(id);
    }

}
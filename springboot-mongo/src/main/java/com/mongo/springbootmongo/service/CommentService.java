package com.mongo.springbootmongo.service;

import com.mongo.springbootmongo.entity.Comment;

import java.util.List;
import java.util.Optional;

/**
 * Description
 * Date 2020/9/21 22:56
 * Created by kwz
 */
public interface CommentService {
    /**
     * 保存一个评论
     * Description
     * Param [comment]
     * return Comment
     */
    Comment saveComment(Comment comment);

    /**
     * 更新评论
     * Description
     * Param [comment]
     * return void
     */
    void updateComment(Comment comment);

    /**
     * 根据id删除评论
     * Description
     * Param [id]
     * return void
     */
    void deleteCommentById(String id);

    /**
     * 查询所有评论
     * Description
     * Param []
     * return java.util.List<com.mongo.springbootmongo.entity.Comment>
     */
    List<Comment> findCommentList();

    /**
     * 根据id查询评论
     * Description
     * Param [id]
     * return com.mongo.springbootmongo.entity.Comment
     */
    Optional<Comment> findCommentById(String id);

}

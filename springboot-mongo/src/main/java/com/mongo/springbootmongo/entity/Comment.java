package com.mongo.springbootmongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Description
 * Date 2020/9/21 22:42
 * Created by kwz
 */
@Document(collection="comment")
@CompoundIndex(def = "{'userId:1,'nickName':-1}")
@Data
public class Comment {
    @Id
    private String id;//主键  
    //该属性对应mongodb的字段的名字，如果一致，则无需该注解  
    @Field("content")
    private String content;
    private Date publishTime;
    @Indexed
    private String userId;
    private String nickname;
    private LocalDateTime createDatetime;
    private Integer likeNum;
    private Integer replyNum;
    private String state;
    private String parentId;
    private String articleId;
}
package com.example.backend.pojo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author HDH
 * @version 1.0
 */
@Entity
@Table(name = "t_blog")
public class Blog {
    /*标题
    内容
    浏览次数
    点赞数
    评论
    评论数
    发布时间
    更新时间*/
    @Id
    @GeneratedValue
    private Long id;
    private String title;//标题
    private String content;//内容
    private int numOfView;//浏览数目
    private String numOfThumbsUp;//点赞数
    private boolean published;//是否发布
    private boolean thumbsUp;//是否点赞
    private boolean commentable;//是否允许评论
    private boolean forward;//是否转发
    @Temporal(TemporalType.TIMESTAMP)
    private Date creatTime;//发布时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;//更新时间
    @ManyToOne
    private User user;//一个博客一个用户
    @OneToMany(mappedBy = "blog")//一个博客多个评论
    private List<Comment> comments = new ArrayList<>();

    public User getUser() {
        return user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Blog() {
    }

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", numOfView=" + numOfView +
                ", numOfThumbsUp='" + numOfThumbsUp + '\'' +
                ", published=" + published +
                ", thumbsUp=" + thumbsUp +
                ", commentable=" + commentable +
                ", forward=" + forward +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumOfView() {
        return numOfView;
    }

    public void setNumOfView(int numOfView) {
        this.numOfView = numOfView;
    }

    public String getNumOfThumbsUp() {
        return numOfThumbsUp;
    }

    public void setNumOfThumbsUp(String numOfThumbsUp) {
        this.numOfThumbsUp = numOfThumbsUp;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isThumbsUp() {
        return thumbsUp;
    }

    public void setThumbsUp(boolean thumbsUp) {
        this.thumbsUp = thumbsUp;
    }

    public boolean isCommentable() {
        return commentable;
    }

    public void setCommentable(boolean commentable) {
        this.commentable = commentable;
    }

    public boolean isForward() {
        return forward;
    }

    public void setForward(boolean forward) {
        this.forward = forward;
    }
}

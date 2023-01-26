package com.example.backend.pojo;

import jakarta.persistence.*;

import java.util.Date;

/**
 * @author HDH
 * @version 1.0
 */
@Entity
@Table(name="t_comment")
public class Comment {
    /*评论
    子评论
    父评论
    点赞数
    评论数
    时间
    用户*/
    @Id
    @GeneratedValue
    private Long id;
    private String nickname;
    private String content;
    private String avatar;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creatTime;

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }
}

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
@Table(name = "t_comment")
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
    private String nickname;//昵称
    private String content;//内容
    private String avatar;//头像
    @Temporal(TemporalType.TIMESTAMP)
    private Date creatTime;//发布时间
    @ManyToOne
    private Blog blog;//一个blog多个评论
    @OneToMany
    private List<Comment> replyComments = new ArrayList<>();//一个评论有多个子评论
    @ManyToOne
    private Comment parentComment;//一个评论对应至多一个父评论

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
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

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
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue
    /*
    用户名
    密码
    头像
    昵称
    生日
    籍贯
    所处地区
    所处单位
    个人简介
    博客发布*/
    private Long id;
    private String username; //用户名
    private String password; //密码
    private String nickname; //昵称
    private String address;  //地址
    private String introduction;  //简介
    private int age;    //年龄
    private String hometown; //籍贯
    private String unit; //单位
    //头像
    private String avatar; //头像
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerTime;//注册时间

    public User() {
    }

    //一个用户多个博客
    @OneToMany(mappedBy = "user")
    private List<Blog> blogs = new ArrayList<>();

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", address='" + address + '\'' +
                ", introduction='" + introduction + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                ", unit='" + unit + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

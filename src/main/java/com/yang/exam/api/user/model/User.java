package com.yang.exam.api.user.model;


import com.alibaba.fastjson.annotation.JSONField;
import com.yang.exam.api.user.entity.UserSession;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column(name = "user_name")
    private String username;
    @Column
    @JSONField(serialize = false)
    private String password;
    @Column
    private String mobile;
    @Column
    private String email;
    @Column
    private String avatar;
    @Column
    private Byte status;
    @Column
    private Byte sex;
    @Column
    private Long signupAt;
    @Transient
    private Integer totalUsrPaper;
    @Transient
    private Integer totalCollect;
    @Transient
    private Integer totalMistakes;
    @Transient
    private UserSession userSession;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Long getSignupAt() {
        return signupAt;
    }

    public void setSignupAt(Long signupAt) {
        this.signupAt = signupAt;
    }
}

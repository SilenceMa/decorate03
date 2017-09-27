package com.decorate.ssm.po;

import javax.validation.constraints.Pattern;

public class User {
    private Integer id;
    @Pattern(regexp = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2e80-\\u9fff]{2,8})",message = "请输入6-16位英文或数字组合或2-8个中文字符")
    private String userName;

    private String password;

    private String phone;
    @Pattern(regexp = "^([a-zA-Z0-9_.-]+)@([\\d a-z.-]+)\\.([a-z.]{2,6})$",message = "您输入的邮箱格式不正确")
    private String userEmail;

    public User() {
    }

    public User(Integer id, String userName, String password, String phone, String userEmail) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.userEmail = userEmail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }
}
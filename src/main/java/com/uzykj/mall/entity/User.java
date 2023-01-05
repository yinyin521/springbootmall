package com.uzykj.mall.entity;

import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
@Transactional
public class User {
    private Integer user_id; //id
    private String user_name; //用户名
    private String user_nickname; //用户的昵称
    private String user_password; //用户密码
    private String user_realname; //用户的真实姓名
    private Byte user_gender; //用户性别
    private Date user_birthday; //用户生日
    private Address user_address; //用户地址
    private Address user_homeplace; //用户的家庭住址编号
    private String user_profile_picture_src; //用户头像
    private List<Review> reviewList; //
    private List<ProductOrderItem> productOrderItemList; //
    private List<ProductOrder> productOrderList; // 用户

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_nickname='" + user_nickname + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_realname='" + user_realname + '\'' +
                ", user_gender=" + user_gender +
                ", user_birthday=" + user_birthday +
                ", user_address=" + user_address +
                ", user_homeplace=" + user_homeplace +
                ", user_profile_picture_src='" + user_profile_picture_src + '\'' +
                ", reviewList=" + reviewList +
                '}';
    }

    public User() {
    }

    public User(Integer user_id, String user_name, String user_nickname, String user_password, Byte user_gender) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_nickname = user_nickname;
        this.user_password = user_password;
        this.user_gender = user_gender;
    } //用户的构造方法1

    public User(Integer user_id, String user_name, String user_nickname, String user_password, String user_realname, Byte user_gender, Date user_birthday, Address user_address, Address user_homeplace, String user_profile_picture_src, List<Review> reviewList) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_nickname = user_nickname;
        this.user_password = user_password;
        this.user_realname = user_realname;
        this.user_gender = user_gender;
        this.user_birthday = user_birthday;
        this.user_address = user_address;
        this.user_homeplace = user_homeplace;
        this.user_profile_picture_src = user_profile_picture_src;
        this.reviewList = reviewList;
    }  //用户的构造方法2

    public Integer getUser_id() {
        return user_id;
    } //获取用户id

    public User setUser_id(Integer user_id) { //设置用户Id
        this.user_id = user_id;
        return this;
    }

    public String getUser_name() {
        return user_name;
    } //获取用户名

    public User setUser_name(String user_name) { //设置用户名
        this.user_name = user_name;
        return this;
    }

    public String getUser_nickname() {
        return user_nickname;
    } //获取用户

    public User setUser_nickname(String user_nickname) { //设置妮名
        this.user_nickname = user_nickname;
        return this;
    }

    public String getUser_password() {
        return user_password;
    } //返回用户密码

    public User setUser_password(String user_password) { //设置用户密码
        this.user_password = user_password;
        return this;
    }

    public String getUser_realname() {
        return user_realname;
    } //获取用户真实姓名

    public User setUser_realname(String user_realname) { //设置用户真实姓名
        this.user_realname = user_realname;
        return this;
    }

    public Byte getUser_gender() {
        return user_gender;
    } //获取用户性别

    public User setUser_gender(Byte user_gender) { //设置用户性别
        this.user_gender = user_gender;
        return this;
    }

    public String getUser_birthday() {
        if(user_birthday != null){
            SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd", Locale.UK);
            return time.format(user_birthday);
        }
        return null;
    }

    public User setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
        return this;
    }

    public Address getUser_address() {
        return user_address;
    }

    public User setUser_address(Address user_address) {
        this.user_address = user_address;
        return this;
    }

    public Address getUser_homeplace() {
        return user_homeplace;
    }

    public User setUser_homeplace(Address user_homeplace) {
        this.user_homeplace = user_homeplace;
        return this;
    }

    public String getUser_profile_picture_src() {
        return user_profile_picture_src;
    }

    public User setUser_profile_picture_src(String user_profile_picture_src) {
        this.user_profile_picture_src = user_profile_picture_src;
        return this;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public User setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
        return this;
    }

    public List<ProductOrderItem> getProductOrderItemList() {
        return productOrderItemList;
    }

    public void setProductOrderItemList(List<ProductOrderItem> productOrderItemList) {
        this.productOrderItemList = productOrderItemList;
    }

    public List<ProductOrder> getProductOrderList() {
        return productOrderList;
    }

    public void setProductOrderList(List<ProductOrder> productOrderList) {
        this.productOrderList = productOrderList;
    }
}

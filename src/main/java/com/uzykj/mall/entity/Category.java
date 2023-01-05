package com.uzykj.mall.entity;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class Category { //分类表

    private Integer category_id; //类别编号
    private String category_name; //类别名称
    private String category_image_src; //类别的图片
    //产品列表
    private List<Product> productList;
    //产品二维集合
    private List<List<Product>> complexProductList;
    //属性列表
    private List<Property> propertyList;

    @Override
    public String toString() { //类别的所有属性
        return "Category{" +
                "category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                ", category_image_src='" + category_image_src + '\'' +
                '}';
    }

    public Category(){ //构造方法

    }

    public Category(Integer category_id, String category_name, String category_image_src) { //构造方法
        this.category_id = category_id;
        this.category_name = category_name;
        this.category_image_src = category_image_src;
    }

    public Integer getCategory_id() {
        return category_id;
    } //获取类别编码

    public Category setCategory_id(Integer category_id) {// 设置类别编码
        this.category_id = category_id;
        return this;
    }

    public String getCategory_name() {
        return category_name;
    } //获取类别名

    public Category setCategory_name(String category_name) {//设置类别名
        this.category_name = category_name;
        return this;
    }

    public String getCategory_image_src() {
        return category_image_src;
    } //获取类别图片

    public Category setCategory_image_src(String category_image_src) { //设置类别图片
        this.category_image_src = category_image_src;
        return this;
    }

    public List<List<Product>> getComplexProductList() {
        return complexProductList;
    } //

    public Category setComplexProductList(List<List<Product>> productList) { //
        this.complexProductList = productList;
        return this;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    } //

    public Category setPropertyList(List<Property> propertyList) { //
        this.propertyList = propertyList;
        return this;
    }

    public List<Product> getProductList() {
        return productList;
    } //

    public Category setProductList(List<Product> productList) { //
        this.productList = productList;
        return this;
    }
}

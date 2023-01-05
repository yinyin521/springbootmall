package com.uzykj.mall.entity;

import org.springframework.transaction.annotation.Transactional;

/*本实体中包含了Address表中的各属性，同时有其对应的构造方法get,set等方法*/

@Transactional
public class Address { //地址表
 /*   Address表中有三个属性 分别是  address._reaId,address_name,address_regionId*/
    private String address_areaId;
    private String address_name;
    private Address address_regionId;

    public Address() {
    }

    @Override
    public String toString() {     // 获取 areaId name regionId
        return "Address{" +
                "address_areaId='" + address_areaId + '\'' +
                ", address_name='" + address_name + '\'' +
                ", address_regionId=" + address_regionId +
                '}';
    }

    public Address(String address_areaId, String address_name, Address address_regionId) { //构造方法
        this.address_areaId = address_areaId;
        this.address_name = address_name;
        this.address_regionId = address_regionId;
    }

    public String getAddress_areaId() {
        return address_areaId;
    } //获取 address_areaId

    public Address setAddress_areaId(String address_areaId) { // 设置 areaId
        this.address_areaId = address_areaId;
        return this;
    }

    public String getAddress_name() {
        return address_name;
    }  //获取 name

    public Address setAddress_name(String address_name) { //设置 name
        this.address_name = address_name;
        return this;
    }

    public Address getAddress_regionId() {
        return address_regionId;
    } //获取regionId

    public Address setAddress_regionId(Address address_regionId) { //设置regionId
        this.address_regionId = address_regionId;
        return this;
    }
}

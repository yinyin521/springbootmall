package com.uzykj.mall.dao;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LastIDMapper {
    int selectLastID();
}

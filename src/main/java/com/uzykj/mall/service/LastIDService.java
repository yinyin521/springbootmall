package com.uzykj.mall.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LastIDService {
    int selectLastID();
}

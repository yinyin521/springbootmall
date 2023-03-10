package com.uzykj.mall.service.impl;

import com.uzykj.mall.dao.LastIDMapper;
import com.uzykj.mall.service.LastIDService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Transactional
@Service("lastIDService")
public class LastIDServiceImpl implements LastIDService {
    private LastIDMapper lastIDMapper;

    @Resource(name = "lastIDMapper")
    public void setLastIDMapper(LastIDMapper lastIDMapper) {
        this.lastIDMapper = lastIDMapper;
    }

    @Override
    public int selectLastID() {
        return lastIDMapper.selectLastID();
    }
}

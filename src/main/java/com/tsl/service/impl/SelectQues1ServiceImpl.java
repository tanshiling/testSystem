package com.tsl.service.impl;

import com.tsl.dao.SelectQues1Dao;
import com.tsl.model.SelectQues;
import com.tsl.service.SelectQues1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectQues1ServiceImpl implements SelectQues1Service {

    @Autowired
    private SelectQues1Dao selectQues1Dao;

    @Override
    public List<SelectQues> getAllSelectQues1() throws Exception {
        return selectQues1Dao.getAllSelectQues1();
    }
}

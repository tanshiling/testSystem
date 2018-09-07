package com.tsl.service.impl;

import com.tsl.dao.InsertQues1Dao;
import com.tsl.dao.InsertQuesDao;
import com.tsl.model.InsertQues;
import com.tsl.service.InsertQues1Service;
import com.tsl.service.InsertQuesService;
import com.tsl.vo.InsertQuesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertQues1ServiceImpl implements InsertQues1Service {

    @Autowired
    private InsertQues1Dao insertQues1Dao;

    @Override
    public List<InsertQues> getAllInsertQues1() throws Exception {
        return insertQues1Dao.getAllInsertQues1();
    }

}

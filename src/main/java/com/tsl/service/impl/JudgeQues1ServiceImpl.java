package com.tsl.service.impl;

import com.tsl.dao.JudgeQues1Dao;
import com.tsl.model.JudgeQues;
import com.tsl.service.JudgeQues1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JudgeQues1ServiceImpl implements JudgeQues1Service{

    @Autowired
    private JudgeQues1Dao judgeQues1Dao;

    @Override
    public List<JudgeQues> getAllJudgeQues1() throws Exception {
        return judgeQues1Dao.getAllJudgeQues1();
    }

}

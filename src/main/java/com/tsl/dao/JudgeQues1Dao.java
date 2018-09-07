package com.tsl.dao;

import com.tsl.model.JudgeQues;
import com.tsl.vo.JudgeQuesVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JudgeQues1Dao {

    //查询
    public List<JudgeQues> getAllJudgeQues1()throws Exception;

}

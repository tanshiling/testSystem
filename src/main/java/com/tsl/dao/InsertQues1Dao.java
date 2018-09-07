package com.tsl.dao;

import com.tsl.model.InsertQues;
import com.tsl.vo.InsertQuesVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsertQues1Dao {

    //查询
    public List<InsertQues> getAllInsertQues1()throws Exception;

}

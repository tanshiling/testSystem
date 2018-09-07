package com.tsl.dao;

import com.tsl.model.SelectQues;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SelectQues1Dao {

    //查询
    public List<SelectQues> getAllSelectQues1()throws Exception;

}

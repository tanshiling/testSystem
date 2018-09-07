package com.tsl.dao;

import com.tsl.model.Application;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Application1Dao {

    //查询
    public List<Application> getAllApplication1()throws Exception;

}

package com.tsl.service.impl;

import com.tsl.dao.Application1Dao;
import com.tsl.dao.ApplicationDao;
import com.tsl.model.Application;
import com.tsl.service.Application1Service;
import com.tsl.service.ApplicationService;
import com.tsl.vo.ApplicationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Application1ServiceImpl implements Application1Service {

    @Autowired
    private Application1Dao application1Dao;

    @Override
    public List<Application> getAllApplication1() throws Exception {
        return application1Dao.getAllApplication1();
    }
}

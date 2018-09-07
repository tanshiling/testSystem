package com.tsl.service.impl;

import com.tsl.dao.Code1Dao;
import com.tsl.dao.CodeDao;
import com.tsl.model.Code;
import com.tsl.service.Code1Service;
import com.tsl.service.CodeService;
import com.tsl.vo.CodeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Code1ServiceImpl implements Code1Service {

    @Autowired
    private Code1Dao code1Dao;

    @Override
    public List<Code> getAllCode1() throws Exception {
        return code1Dao.getAllCode1();
    }

}

package com.tsl.service.impl;

import com.tsl.dao.ShortAnswer1Dao;
import com.tsl.dao.ShortAnswerDao;
import com.tsl.model.ShortAnswer;
import com.tsl.service.ShortAnswer1Service;
import com.tsl.service.ShortAnswerService;
import com.tsl.vo.ShortAnswerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShortAnswer1ServiceImpl implements ShortAnswer1Service {

    @Autowired
    private ShortAnswer1Dao shortAnswer1Dao;

    @Override
    public List<ShortAnswer> getAllShortAnswer1() throws Exception {
        return shortAnswer1Dao.getAllShortAnswer1();
    }
}

package com.tsl.service.impl;

import com.tsl.dao.ShortAnswerDao;
import com.tsl.model.ShortAnswer;
import com.tsl.service.KnowledgeService;
import com.tsl.service.ShortAnswerService;
import com.tsl.vo.ShortAnswerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShortAnswerServiceImpl implements ShortAnswerService{

    @Autowired
    private ShortAnswerDao shortAnswerDao;

    @Override
    public List<ShortAnswerVo> getAllShortAnswer() throws Exception {
        return shortAnswerDao.getAllShortAnswer();
    }

    @Override
    public void addShortAnswer(ShortAnswerVo shortAnswerVo) throws Exception {
        shortAnswerDao.addShortAnswer(shortAnswerVo);
    }

    @Override
    public void updateShortAnswer(ShortAnswerVo shortAnswerVo) throws Exception {
        shortAnswerDao.updateShortAnswer(shortAnswerVo);
    }

    @Override
    public void deleteShortAnswer(int said) throws Exception {
        shortAnswerDao.deleteShortAnswer(said);
    }

    @Override
    public ShortAnswerVo findShortAnswerById(int said) throws Exception {
        return shortAnswerDao.findShortAnswerById(said);
    }
}

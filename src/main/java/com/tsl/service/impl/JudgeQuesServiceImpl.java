package com.tsl.service.impl;

import com.tsl.dao.JudgeQuesDao;
import com.tsl.model.JudgeQues;
import com.tsl.service.JudgeQuesService;
import com.tsl.vo.JudgeQuesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JudgeQuesServiceImpl implements JudgeQuesService{

    @Autowired
    private JudgeQuesDao judgeQuesDao;

    public JudgeQuesDao getJudgeQuesDao() {
        return judgeQuesDao;
    }

    public void setJudgeQuesDao(JudgeQuesDao judgeQuesDao) {
        this.judgeQuesDao = judgeQuesDao;
    }

    @Override
    public List<JudgeQuesVo> getAllJudgeQues() throws Exception {
        return judgeQuesDao.getAllJudgeQues();
    }
/*
    @Override
    public int findKno(JudgeQuesVo judgeQuesVo) throws Exception {
        return judgeQuesDao.findKno(judgeQuesVo);
    }

  */  @Override
    public void addJudgeQues(JudgeQuesVo judgeQuesVo) throws Exception {
        judgeQuesDao.addJudgeQues(judgeQuesVo);
    }
    @Override
    public void updateJudgeQues(JudgeQuesVo judgeQuesVo) throws Exception {
        judgeQuesDao.updateJudgeQues(judgeQuesVo);
    }
    @Override
    public void deleteJudgeQues(int jid) throws Exception {
        judgeQuesDao.deleteJudgeQues(jid);
    }

    @Override
    public JudgeQuesVo findJudgeQuesById(int jid) throws Exception {
        return judgeQuesDao.findJudgeQuesById(jid);
    }
}

package com.tsl.service.impl;

import com.tsl.dao.SelectQuesDao;
import com.tsl.model.SelectQues;
import com.tsl.service.SelectQuesService;
import com.tsl.vo.SelectQuesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectQuesServiceImpl implements SelectQuesService {

    @Autowired
    private SelectQuesDao selectQuesDao;

    public SelectQuesDao getSelectQuesDao() {
        return selectQuesDao;
    }

    public void setSelectQuesDao(SelectQuesDao selectQuesDao) {
        this.selectQuesDao = selectQuesDao;
    }

    @Override
    public List<SelectQuesVo> getAllSelectQues() throws Exception {
        return selectQuesDao.getAllSelectQues();
    }

    @Override
    public void addSelectQues(SelectQuesVo selectQuesVo) throws Exception {
        selectQuesDao.addSelectQues(selectQuesVo);
    }

    @Override
    public void updateSelectQues(SelectQuesVo selectQuesVo) throws Exception {
        selectQuesDao.updateSelectQues(selectQuesVo);
    }

    @Override
    public void deleteSelectQues(int sid) throws Exception {
        selectQuesDao.deleteSelectQues(sid);
    }

    @Override
    public SelectQuesVo findSelectQuesById(int sid) throws Exception {
        return selectQuesDao.findSelectQuesById(sid);
    }
}

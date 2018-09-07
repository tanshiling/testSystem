package com.tsl.service.impl;

import com.tsl.dao.InsertQuesDao;
import com.tsl.model.InsertQues;
import com.tsl.service.InsertQuesService;
import com.tsl.vo.InsertQuesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertQuesServiceImpl implements InsertQuesService{

    @Autowired
    private InsertQuesDao insertQuesDao;

    public InsertQuesDao getInsertQuesDao() {
        return insertQuesDao;
    }

    public void setInsertQuesDao(InsertQuesDao insertQuesDao) {
        this.insertQuesDao = insertQuesDao;
    }

    @Override
    public List<InsertQuesVo> getAllInsertQues() throws Exception {
        return insertQuesDao.getAllInsertQues();
    }

    @Override
    public void addInsertQues(InsertQuesVo insertQuesVo) throws Exception {
        insertQuesDao.addInsertQues(insertQuesVo);
    }

    @Override
    public void updateInsertQues(InsertQuesVo insertQuesVo) throws Exception {
        insertQuesDao.updateInsertQues(insertQuesVo);
    }

    @Override
    public void deleteInsertQues(int iid) throws Exception {
        insertQuesDao.deleteInsertQues(iid);
    }

    @Override
    public InsertQuesVo findInsertQuesById(int iid) throws Exception {
        return insertQuesDao.findInsertQuesById(iid);
    }
}

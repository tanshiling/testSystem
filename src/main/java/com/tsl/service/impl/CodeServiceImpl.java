package com.tsl.service.impl;

import com.tsl.dao.CodeDao;
import com.tsl.model.Code;
import com.tsl.service.CodeService;
import com.tsl.vo.CodeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService{

    @Autowired
    private CodeDao codeDao;

    public CodeDao getCodeDao() {
        return codeDao;
    }

    public void setCodeDao(CodeDao codeDao) {
        this.codeDao = codeDao;
    }

    @Override
    public List<CodeVo> getAllCode() throws Exception {
        return codeDao.getAllCode();
    }

    @Override
    public void addCode(CodeVo codeVo) throws Exception {
        codeDao.addCode(codeVo);
    }

    @Override
    public void updateCode(CodeVo codeVo) throws Exception {
        codeDao.updateCode(codeVo);
    }

    @Override
    public void deleteCode(int cid) throws Exception {
        codeDao.deleteCode(cid);
    }

    @Override
    public CodeVo findCodeById(int cid) throws Exception {
        return codeDao.findCodeById(cid);
    }
}

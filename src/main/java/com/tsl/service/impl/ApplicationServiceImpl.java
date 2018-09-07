package com.tsl.service.impl;

import com.tsl.dao.ApplicationDao;
import com.tsl.service.ApplicationService;
import com.tsl.vo.ApplicationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Autowired
    private ApplicationDao applicationDao;

    public ApplicationDao getApplicationDao() {
        return applicationDao;
    }

    public void setApplicationDao(ApplicationDao applicationDao) {
        this.applicationDao = applicationDao;
    }

    @Override
    public List<ApplicationVo> getAllApplication() throws Exception {
        return applicationDao.getAllApplication();
    }

    @Override
    public void addApplication(ApplicationVo applicationVo) throws Exception {
        applicationDao.addApplication(applicationVo);
    }

    @Override
    public void updateApplication(ApplicationVo applicationVo) throws Exception {
        applicationDao.updateApplication(applicationVo);
    }

    @Override
    public void deleteApplication(int aid) throws Exception {
        applicationDao.deleteApplication(aid);
    }

    @Override
    public ApplicationVo findApplicationById(int aid) throws Exception {
        return applicationDao.findApplicationById(aid);
    }
}

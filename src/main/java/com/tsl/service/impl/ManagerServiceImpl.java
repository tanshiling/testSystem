package com.tsl.service.impl;

import com.tsl.dao.ManagerDao;
import com.tsl.model.Manager;
import com.tsl.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao managerDao;

    public ManagerDao getManagerDao() {
        return managerDao;
    }

    public void setManagerDao(ManagerDao managerDao) {
        this.managerDao = managerDao;
    }

    @Override
    public Manager login(String mname, String mpassword) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        map.put("mname", mname) ;
        map.put("mpassword", mpassword) ;

        return managerDao.login(map);
    }

    @Override
    public List<Manager> getAllManager() throws Exception {
        return managerDao.getAllManager();
    }

    @Override
    public void addManager(Manager manager) throws Exception {
        managerDao.addManager(manager);
    }

    @Override
    public void updateManager(Manager manager) throws Exception {
        managerDao.updateManager(manager);
    }

    @Override
    public void deleteManager(int mid) throws Exception {
        managerDao.deleteManager(mid);
    }

    @Override
    public Manager findManagerById(int mid) throws Exception {
        return managerDao.findManagerById(mid);
    }
}

package com.tsl.service;

import com.tsl.model.Manager;

import java.util.List;

public interface ManagerService {

    public Manager login(String mname,String mpassword) throws Exception;

    //查询
    public List<Manager> getAllManager()throws Exception;

    //添加
    public void addManager(Manager manager)throws Exception;

    //修改
    public void updateManager(Manager manager)throws Exception;

    //删除
    public void deleteManager(int mid)throws Exception;

    //根据id查找
    public Manager findManagerById(int mid) throws Exception;
}

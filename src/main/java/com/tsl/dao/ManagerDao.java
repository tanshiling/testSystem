package com.tsl.dao;

import com.tsl.model.Manager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ManagerDao {

    //登录
    public Manager login(Map<String,String> map) throws Exception;

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

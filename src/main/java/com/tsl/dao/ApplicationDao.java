package com.tsl.dao;

import com.tsl.model.Application;
import com.tsl.vo.ApplicationVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationDao {

    //查询
    public List<ApplicationVo> getAllApplication()throws Exception;

    //添加
    public void addApplication(ApplicationVo applicationVo)throws Exception;

    //修改
    public void updateApplication(ApplicationVo applicationVo)throws Exception;

    //删除
    public void deleteApplication(int aid)throws Exception;

    //根据id查找
    public ApplicationVo findApplicationById(int aid) throws Exception;
}

package com.tsl.service;

import com.tsl.model.InsertQues;
import com.tsl.vo.InsertQuesVo;

import java.util.List;

public interface InsertQuesService {

    //查询
    public List<InsertQuesVo> getAllInsertQues()throws Exception;

    //添加
    public void addInsertQues(InsertQuesVo insertQuesVo)throws Exception;

    //修改
    public void updateInsertQues(InsertQuesVo insertQuesVo)throws Exception;

    //删除
    public void deleteInsertQues(int iid)throws Exception;

    //根据id查找
    public InsertQuesVo findInsertQuesById(int iid) throws Exception;
}

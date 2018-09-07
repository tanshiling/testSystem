package com.tsl.dao;

import com.tsl.model.SelectQues;
import com.tsl.vo.SelectQuesVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SelectQuesDao {

    //查询
    public List<SelectQuesVo> getAllSelectQues()throws Exception;

    //添加
    public void addSelectQues(SelectQuesVo selectQuesVo)throws Exception;

    //修改
    public void updateSelectQues(SelectQuesVo selectQuesVo)throws Exception;

    //删除
    public void deleteSelectQues(int sid)throws Exception;

    //根据id查找
    public SelectQuesVo findSelectQuesById(int sid) throws Exception;
}

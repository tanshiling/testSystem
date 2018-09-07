package com.tsl.dao;

import com.tsl.model.ShortAnswer;
import com.tsl.vo.ShortAnswerVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShortAnswerDao {

    //查询
    public List<ShortAnswerVo> getAllShortAnswer()throws Exception;

    //添加
    public void addShortAnswer(ShortAnswerVo shortAnswerVo)throws Exception;

    //修改
    public void updateShortAnswer(ShortAnswerVo shortAnswerVo)throws Exception;

    //删除
    public void deleteShortAnswer(int said)throws Exception;

    //根据id查找
    public ShortAnswerVo findShortAnswerById(int said) throws Exception;
}

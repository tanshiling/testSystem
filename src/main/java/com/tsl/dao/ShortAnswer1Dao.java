package com.tsl.dao;

import com.tsl.model.ShortAnswer;
import com.tsl.vo.ShortAnswerVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShortAnswer1Dao {

    //查询
    public List<ShortAnswer> getAllShortAnswer1()throws Exception;

}

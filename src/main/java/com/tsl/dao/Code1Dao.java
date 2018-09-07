package com.tsl.dao;

import com.tsl.model.Code;
import com.tsl.vo.CodeVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Code1Dao {

    //查询
    public List<Code> getAllCode1()throws Exception;

}

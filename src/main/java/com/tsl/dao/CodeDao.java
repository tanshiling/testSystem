package com.tsl.dao;

import com.tsl.model.Code;
import com.tsl.vo.CodeVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeDao {

    //查询
    public List<CodeVo> getAllCode()throws Exception;

    //添加
    public void addCode(CodeVo codeVo)throws Exception;

    //修改
    public void updateCode(CodeVo codeVo)throws Exception;

    //删除
    public void deleteCode(int cid)throws Exception;

    //根据id查找
    public CodeVo findCodeById(int cid) throws Exception;
}

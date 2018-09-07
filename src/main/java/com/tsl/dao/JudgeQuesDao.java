package com.tsl.dao;

import com.tsl.model.JudgeQues;
import com.tsl.vo.JudgeQuesVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JudgeQuesDao {

    //查询
    public List<JudgeQuesVo> getAllJudgeQues()throws Exception;

    //添加
    public void addJudgeQues(JudgeQuesVo judgeQuesVo)throws Exception;

    //修改
    public void updateJudgeQues(JudgeQuesVo judgeQuesVo)throws Exception;

    //删除
    public void deleteJudgeQues(int jid)throws Exception;

    //根据id查找
    public JudgeQuesVo findJudgeQuesById(int jid) throws Exception;
}

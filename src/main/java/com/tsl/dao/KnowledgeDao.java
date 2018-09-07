package com.tsl.dao;

import com.tsl.model.Knowledge;
import com.tsl.vo.KnowledgeVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KnowledgeDao {

    //查询
    public List<KnowledgeVo> getAllKnowledge()throws Exception;

    //添加
    public void addKnowledge(KnowledgeVo knowledgeVo)throws Exception;

    //删除
    public void deleteKnowledge(int kno) throws Exception;

    //修改
    public void updateKnowledge(KnowledgeVo knowledgeVo)throws Exception;

    //根据id查找
    public KnowledgeVo findKnowledgeByKno(int kno) throws Exception;

}

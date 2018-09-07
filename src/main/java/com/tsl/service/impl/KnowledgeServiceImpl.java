package com.tsl.service.impl;

import com.tsl.dao.KnowledgeDao;
import com.tsl.service.KnowledgeService;
import com.tsl.vo.KnowledgeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeServiceImpl implements KnowledgeService {

    @Autowired
    private KnowledgeDao knowledgeDao;

    public KnowledgeDao getKnowledgeDao() {
        return knowledgeDao;
    }

    public void setKnowledgeDao(KnowledgeDao knowledgeDao) {
        this.knowledgeDao = knowledgeDao;
    }

    @Override
    public List<KnowledgeVo> getAllKnowledge() throws Exception {
        return knowledgeDao.getAllKnowledge();
    }

    @Override
    public void addKnowledge(KnowledgeVo knowledgeVo) throws Exception {
        knowledgeDao.addKnowledge(knowledgeVo);
    }

    @Override
    public void deleteKnowledge(int kno) throws Exception {
        knowledgeDao.deleteKnowledge(kno);
    }

    @Override
    public void updateKnowledge(KnowledgeVo knowledgeVo) throws Exception {
        knowledgeDao.updateKnowledge(knowledgeVo);
    }

    @Override
    public KnowledgeVo findKnowledgeByKno(int kno) throws Exception {
        return knowledgeDao.findKnowledgeByKno(kno);
    }
}

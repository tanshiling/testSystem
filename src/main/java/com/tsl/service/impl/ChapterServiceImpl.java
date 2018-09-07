package com.tsl.service.impl;

import com.tsl.dao.ChapterDao;
import com.tsl.model.Chapter;
import com.tsl.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService{

    @Autowired
    private ChapterDao chapterDao;

    public ChapterDao getChapterDao() {
        return chapterDao;
    }

    public void setChapterDao(ChapterDao chapterDao) {
        this.chapterDao = chapterDao;
    }

    @Override
    public List<Chapter> getAllChapter() throws Exception {
        return chapterDao.getAllChapter();
    }

    @Override
    public void addChapter(Chapter chapter) throws Exception {
        chapterDao.addChapter(chapter);
    }

    @Override
    public void deleteChapter(int cno) throws Exception {
        chapterDao.deleteChapter(cno);
    }

    @Override
    public void updateChapter(Chapter chapter) throws Exception {
        chapterDao.updateChapter(chapter);
    }

    @Override
    public int countKnows(int cno) throws Exception {
        return chapterDao.countKnows(cno);
    }

    @Override
    public Chapter findChapterByNo(int cno) throws Exception {
        return chapterDao.findChapterByNo(cno);
    }
}

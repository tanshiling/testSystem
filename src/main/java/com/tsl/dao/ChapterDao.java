package com.tsl.dao;

import com.tsl.model.Chapter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterDao {

    //查询
    public List<Chapter> getAllChapter()throws Exception;

    //添加
    public void addChapter(Chapter chapter)throws Exception;

    //删除
    public void deleteChapter(int cno) throws Exception;

    //修改
    public void updateChapter(Chapter chapter)throws Exception;

    //一个章节包含多少知识点
    public int countKnows(int cno) throws Exception;

    //根据id查找
    public Chapter findChapterByNo(int cno) throws Exception;

}

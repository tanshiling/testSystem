package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.Chapter;
import com.tsl.service.ChapterService;
import com.tsl.utils.Page;
import com.tsl.vo.ChapterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/chapter")
public class ChapterAction {

    @Autowired
    private ChapterService chapterService;

    public ChapterService getChapterService() {
        return chapterService;
    }

    public void setChapterService(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    @RequestMapping("/getAllChapter.action")
    public ModelAndView getAllChapter(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        PageHelper.offsetPage(page.getStart(),5);
        List<Chapter> list = chapterService.getAllChapter();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("chapterList",list);
        md.setViewName("chapter");
        return md;
    }

    @RequestMapping("/findChapterByNo.action")
    public ModelAndView findChapterByNo(int cno) throws Exception {
        Chapter c= chapterService.findChapterByNo(cno);
        ModelAndView md = new ModelAndView();
        md.addObject("chapter", c);
        md.setViewName("chapter-modify");
        return md;
    }

    @RequestMapping("/deleteChapter.action")
    public String deleteChapter(int cno) throws Exception {
        chapterService.deleteChapter(cno);
        return "redirect:getAllChapter.action";
    }

    @RequestMapping("/updateChapter.action")
    public ModelAndView updateChapter(Chapter chapter) throws Exception{
        chapterService.updateChapter(chapter);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllChapter.action");
        return md;
    }

    @RequestMapping("/newChapter.action")
    public String newCode(){
        return "chapter-add";
    }

    @RequestMapping("/addChapter.action")
    public ModelAndView addChapter(Chapter chapter) throws Exception{
        chapterService.addChapter(chapter);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllChapter.action");
        return md;
    }

}

package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.Chapter;
import com.tsl.service.ChapterService;
import com.tsl.service.KnowledgeService;
import com.tsl.utils.Page;
import com.tsl.vo.KnowledgeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/knowledge")
public class KnowledgeAction {

    @Autowired
    private KnowledgeService knowledgeService;

    @Autowired
    private ChapterService chapterService;

    public KnowledgeService getKnowledgeService() {
        return knowledgeService;
    }

    public void setKnowledgeService(KnowledgeService knowledgeService) {
        this.knowledgeService = knowledgeService;
    }

    @RequestMapping("/getAllKnowledge.action")
    public ModelAndView getAllKnowledge(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<KnowledgeVo> list = knowledgeService.getAllKnowledge();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("knowledgeList",list);
        md.setViewName("knowledge");
        return md;
    }

    @RequestMapping("/deleteKnowledge.action")
    public String deleteKnowledge(int kno) throws Exception {
        knowledgeService.deleteKnowledge(kno);
        return "redirect:getAllKnowledge.action";
    }

    @RequestMapping("/findKnowledgeByKno.action")
    public ModelAndView findKnowledgeByKno(int kno) throws Exception {
        KnowledgeVo knowledgeVo= knowledgeService.findKnowledgeByKno(kno);
        List<Chapter> list = chapterService.getAllChapter();
        ModelAndView md = new ModelAndView();
        md.addObject("knowledgeVo", knowledgeVo);
        md.addObject("ccc",list);
        md.setViewName("knowledge-modify");
        return md;
    }

    @RequestMapping("/updateKnowledge.action")
    public ModelAndView updateKnowledge(KnowledgeVo knowledgeVo) throws Exception{
        knowledgeService.updateKnowledge(knowledgeVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllKnowledge.action");
        return md;
    }
    @RequestMapping("/newKnowledge.action")
    public ModelAndView newKnowledge() throws Exception{
        List<Chapter> list = chapterService.getAllChapter();
        ModelAndView md = new ModelAndView();
        md.addObject("ccc",list);
        md.setViewName("knowledge-add");
        return md;
    }


    @RequestMapping("/addKnowledge.action")
    public ModelAndView addKnowledge(KnowledgeVo knowledgeVo) throws Exception{
        knowledgeService.addKnowledge(knowledgeVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllKnowledge.action");
        return md;
    }
}

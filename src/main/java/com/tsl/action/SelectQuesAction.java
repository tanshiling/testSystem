package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.SelectQues;
import com.tsl.service.KnowledgeService;
import com.tsl.service.SelectQuesService;
import com.tsl.utils.Page;
import com.tsl.vo.KnowledgeVo;
import com.tsl.vo.SelectQuesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/selectques")
public class SelectQuesAction {

    @Autowired
    private SelectQuesService selectQuesService;

    @Autowired
    private KnowledgeService knowledgeService;

    public SelectQuesService getSelectQuesService() {
        return selectQuesService;
    }

    public void setSelectQuesService(SelectQuesService selectQuesService) {
        this.selectQuesService = selectQuesService;
    }

    @RequestMapping("/getAllSelectQues.action")
    public ModelAndView getAllSelectQues(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<SelectQuesVo> list = selectQuesService.getAllSelectQues();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("selectQuesList",list);
        md.setViewName("selectQues");
        return md;
    }

    @RequestMapping("/deleteSelectQues.action")
    public String deleteSelectQues(int sid) throws Exception {
        selectQuesService.deleteSelectQues(sid);
        return "redirect:getAllSelectQues.action";
    }

    @RequestMapping("/findSelectQuesById.action")
    public ModelAndView findSelectQuesById(int sid) throws Exception {
        SelectQuesVo s= selectQuesService.findSelectQuesById(sid);
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("selectQuesVo", s);
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("selectQues-modify");
        return md;
    }

    @RequestMapping("/updateSelectQues.action")
    public ModelAndView updateSelectQues(SelectQuesVo selectQuesVo) throws Exception{
        selectQuesService.updateSelectQues(selectQuesVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllSelectQues.action");
        return md;
    }

    @RequestMapping("/newSelectQues.action")
    public ModelAndView newSelectQues() throws Exception{
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("selectQues-add");
        return md;
    }

    @RequestMapping("/addSelectQues.action")
    public ModelAndView addSelectQues(SelectQuesVo selectQuesVo) throws Exception{
        selectQuesService.addSelectQues(selectQuesVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllSelectQues.action");
        return md;
    }
}

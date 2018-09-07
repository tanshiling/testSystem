package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.InsertQues;
import com.tsl.service.InsertQuesService;
import com.tsl.service.KnowledgeService;
import com.tsl.utils.Page;
import com.tsl.vo.InsertQuesVo;
import com.tsl.vo.KnowledgeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/insertques")
public class InsertQuesAction {

    @Autowired
    private InsertQuesService insertQuesService;

    @Autowired
    private KnowledgeService knowledgeService;

    public InsertQuesService getInsertQuesService() {
        return insertQuesService;
    }

    public void setInsertQuesService(InsertQuesService insertQuesService) {
        this.insertQuesService = insertQuesService;
    }

    @RequestMapping("/getAllInsertQues.action")
    public ModelAndView getAllInsertQues(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<InsertQuesVo> list = insertQuesService.getAllInsertQues();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("insertQuesList",list);
        md.setViewName("insertQues");
        return md;
    }

    @RequestMapping("/deleteInsertQues.action")
    public String deleteInsertQues(int iid) throws Exception {
        insertQuesService.deleteInsertQues(iid);
        return "redirect:getAllInsertQues.action";
    }

    @RequestMapping("/findInsertQuesById.action")
    public ModelAndView findInsertQuesById(int iid) throws Exception {
        InsertQuesVo i= insertQuesService.findInsertQuesById(iid);
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("insertQuesVo", i);
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("insertQues-modify");
        return md;
    }

    @RequestMapping("/updateInsertQues.action")
    public ModelAndView updateInsertQues(InsertQuesVo insertQuesVo) throws Exception{
        insertQuesService.updateInsertQues(insertQuesVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllInsertQues.action");
        return md;
    }

    @RequestMapping("/newInsertQues.action")
    public ModelAndView newInsertQues() throws Exception{
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("insertQues-add");
        return md;
    }

    @RequestMapping("/addInsertQues.action")
    public ModelAndView addInsertQues(InsertQuesVo insertQuesVo) throws Exception{
        insertQuesService.addInsertQues(insertQuesVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllInsertQues.action");
        return md;
    }
}

package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.service.JudgeQuesService;
import com.tsl.service.KnowledgeService;
import com.tsl.utils.Page;
import com.tsl.vo.JudgeQuesVo;
import com.tsl.vo.KnowledgeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/judgeques")
public class JudgeQuesAction {

    @Autowired
    private JudgeQuesService judgeQuesService;

    @Autowired
    private KnowledgeService knowledgeService;

    public JudgeQuesService getJudgeQuesService() {
        return judgeQuesService;
    }

    public void setJudgeQuesService(JudgeQuesService judgeQuesService) {
        this.judgeQuesService = judgeQuesService;
    }

    @RequestMapping("/getAllJudgeQues.action")
    public ModelAndView getAllJudgeQues(Page page) throws Exception{
        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<JudgeQuesVo> list = judgeQuesService.getAllJudgeQues();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("judgeQuesList",list);
        md.setViewName("judgeQues");
        return md;
    }

    @RequestMapping("/deleteJudgeQues.action")
    public String deleteJudgeQues(int jid) throws Exception {
        judgeQuesService.deleteJudgeQues(jid);
        return "redirect:getAllJudgeQues.action";
    }

    @RequestMapping("/findJudgeQuesById.action")
    public ModelAndView findJudgeQuesById(int jid) throws Exception {
        JudgeQuesVo judgeQuesVo= judgeQuesService.findJudgeQuesById(jid);
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("judgeQuesVo", judgeQuesVo);
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("judgeQues-modify");
        return md;
    }

    @RequestMapping("/updateJudgeQues.action")
    public ModelAndView updateJudgeQues(JudgeQuesVo judgeQuesVo) throws Exception{
        judgeQuesService.updateJudgeQues(judgeQuesVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllJudgeQues.action");
        return md;
    }

   /* @RequestMapping("/newJudgeQues.action")
    public String newJudgeQues(){
        return "judgeQues-add";
    }*/
   @RequestMapping("/newJudgeQues.action")
   public ModelAndView newJudgeQues() throws Exception{
       List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
       ModelAndView md = new ModelAndView();
       md.addObject("kkk",knowledgeVoList);
       md.setViewName("judgeQues-add");
       return md;
   }


    @RequestMapping("/addJudgeQues.action")
    public ModelAndView addJudgeQues(JudgeQuesVo judgeQuesVo) throws Exception{
        judgeQuesService.addJudgeQues(judgeQuesVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllJudgeQues.action");
        return md;
    }
}

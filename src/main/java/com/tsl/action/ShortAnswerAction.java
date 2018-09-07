package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.ShortAnswer;
import com.tsl.service.KnowledgeService;
import com.tsl.service.ShortAnswerService;
import com.tsl.utils.Page;
import com.tsl.vo.KnowledgeVo;
import com.tsl.vo.ShortAnswerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/shortanswer")
public class ShortAnswerAction {

    @Autowired
    private ShortAnswerService shortAnswerService;

    @Autowired
    private KnowledgeService knowledgeService;

    public ShortAnswerService getShortAnswerService() {
        return shortAnswerService;
    }

    public void setShortAnswerService(ShortAnswerService shortAnswerService) {
        this.shortAnswerService = shortAnswerService;
    }

    @RequestMapping("/getAllShortAnswer.action")
    public ModelAndView getAllShortAnswer(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<ShortAnswerVo> list = shortAnswerService.getAllShortAnswer();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("shortAnswerList",list);
        md.setViewName("shortAnswer");
        return md;
    }

    @RequestMapping("/deleteShortAnswer.action")
    public String deleteShortAnswer(int said) throws Exception {
        shortAnswerService.deleteShortAnswer(said);
        return "redirect:getAllShortAnswer.action";
    }

    @RequestMapping("/findShortAnswerById.action")
    public ModelAndView findShortAnswerById(int said) throws Exception {
        ShortAnswerVo s= shortAnswerService.findShortAnswerById(said);
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("shortAnswerVo", s);
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("shortAnswer-modify");
        return md;
    }

    @RequestMapping("/updateShortAnswer.action")
    public ModelAndView updateICode(ShortAnswerVo shortAnswerVo) throws Exception{
        shortAnswerService.updateShortAnswer(shortAnswerVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllShortAnswer.action");
        return md;
    }

    @RequestMapping("/newShortAnswer.action")
    public ModelAndView newShortAnswer() throws Exception{
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("shortAnswer-add");
        return md;
    }

    @RequestMapping("/addShortAnswer.action")
    public ModelAndView addShortAnswer(ShortAnswerVo shortAnswerVo) throws Exception{
        shortAnswerService.addShortAnswer(shortAnswerVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllShortAnswer.action");
        return md;
    }
}

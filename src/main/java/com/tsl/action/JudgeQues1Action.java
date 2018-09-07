package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.JudgeQues;
import com.tsl.service.JudgeQues1Service;
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
@RequestMapping("/judgeques1")
public class JudgeQues1Action {

    @Autowired
    private JudgeQues1Service judgeQues1Service;

    @RequestMapping("/getAllJudgeQues1.action")
    public ModelAndView getAllJudgeQues1(Page page) throws Exception{
        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<JudgeQues> list = judgeQues1Service.getAllJudgeQues1();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("judgeQues1List",list);
        md.setViewName("judgeQues1");
        return md;
    }

}

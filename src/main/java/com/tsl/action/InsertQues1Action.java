package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.InsertQues;
import com.tsl.service.InsertQues1Service;
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
@RequestMapping("/insertques1")
public class InsertQues1Action {

    @Autowired
    private InsertQues1Service insertQues1Service;

    @RequestMapping("/getAllInsertQues1.action")
    public ModelAndView getAllInsertQues1(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<InsertQues> list = insertQues1Service.getAllInsertQues1();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("insertQues1List",list);
        md.setViewName("insertQues1");
        return md;
    }
}

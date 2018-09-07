package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.SelectQues;
import com.tsl.service.SelectQues1Service;
import com.tsl.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/selectques1")
public class SelectQues1Action {

    @Autowired
    private SelectQues1Service selectQues1Service;

    @RequestMapping("/getAllSelectQues1.action")
    public ModelAndView getAllSelectQues1(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<SelectQues> list = selectQues1Service.getAllSelectQues1();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("selectQues1List",list);
        md.setViewName("selectQues1");
        return md;
    }
}

package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.ShortAnswer;
import com.tsl.service.KnowledgeService;
import com.tsl.service.ShortAnswer1Service;
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
@RequestMapping("/shortanswer1")
public class ShortAnswer1Action {

    @Autowired
    private ShortAnswer1Service shortAnswer1Service;

    @RequestMapping("/getAllShortAnswer1.action")
    public ModelAndView getAllShortAnswer1(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<ShortAnswer> list = shortAnswer1Service.getAllShortAnswer1();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("shortAnswer1List",list);
        md.setViewName("shortAnswer1");
        return md;
    }

}

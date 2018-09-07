package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.Code;
import com.tsl.service.Code1Service;
import com.tsl.service.CodeService;
import com.tsl.service.KnowledgeService;
import com.tsl.utils.Page;
import com.tsl.vo.CodeVo;
import com.tsl.vo.KnowledgeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/code1")
public class Code1Action {

    @Autowired
    private Code1Service code1Service;

    @RequestMapping("/getAllCode1.action")
    public ModelAndView getAllCode1(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<Code> list = code1Service.getAllCode1();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("code1List",list);
        md.setViewName("code1");
        return md;
    }

}

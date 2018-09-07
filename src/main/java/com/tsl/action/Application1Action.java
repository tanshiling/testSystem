package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.Application;
import com.tsl.service.Application1Service;
import com.tsl.service.ApplicationService;
import com.tsl.service.KnowledgeService;
import com.tsl.utils.Page;
import com.tsl.vo.ApplicationVo;
import com.tsl.vo.KnowledgeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/application1")
public class Application1Action {

    @Autowired
    private Application1Service application1Service;

    @RequestMapping("/getAllApplication1.action")
    public ModelAndView getAllApplication1(Page page) throws Exception{
        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<Application> list = application1Service.getAllApplication1();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("application1List",list);
        md.setViewName("application1");
        return md;
    }

}

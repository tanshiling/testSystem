package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
@RequestMapping("/application")
public class ApplicationAction {

    @Autowired
    private ApplicationService applicationService;
    @Autowired
    private KnowledgeService knowledgeService;

    public ApplicationService getApplicationService() {
        return applicationService;
    }

    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @RequestMapping("/getAllApplication.action")
    public ModelAndView getAllApplication(Page page) throws Exception{
        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<ApplicationVo> list = applicationService.getAllApplication();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("applicationList",list);
        md.setViewName("application");
        return md;
    }

    @RequestMapping("/deleteApplication.action")
    public String deleteApplication(int aid) throws Exception {
        applicationService.deleteApplication(aid);
        return "redirect:getAllApplication.action";
    }

    @RequestMapping("/findApplicationById.action")
    public ModelAndView findApplicationById(int aid) throws Exception {
        ApplicationVo applicationVo= applicationService.findApplicationById(aid);
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("applicationVo", applicationVo);
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("application-modify");
        return md;
    }

    @RequestMapping("/updateApplication.action")
    public ModelAndView updateApplication(ApplicationVo applicationVo) throws Exception{
        applicationService.updateApplication(applicationVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllApplication.action");
        return md;
    }

    @RequestMapping("/newApplication.action")
    public ModelAndView newApplication() throws Exception{
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("application-add");
        return md;
    }

    @RequestMapping("/addApplication.action")
    public String addApplication(ApplicationVo applicationVo,MultipartFile apicture1,MultipartFile aanswerp1) throws Exception{

        String name = apicture1.getOriginalFilename();
        String name1 = aanswerp1.getOriginalFilename();

        String filetype = name.substring(name.lastIndexOf(".")) ;
        String filetype1 = name1.substring(name.lastIndexOf(".")) ;

        String filename =  UUID.randomUUID().toString() + filetype;
        String filename1 =  UUID.randomUUID().toString() + filetype1;

        File dest = new File("D:/fileupload/pic/" + filename);
        File dest1 = new File("D:/fileupload/pic/" + filename1);

        //上传文件
        apicture1.transferTo(dest);
        aanswerp1.transferTo(dest1);

        applicationVo.setApicture(filename);
        applicationVo.setAanswerp(filename1);
        applicationService.addApplication(applicationVo);
        return "redirect:getAllApplication.action";
    }
}

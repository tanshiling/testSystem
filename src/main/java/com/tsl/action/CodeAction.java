package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.service.CodeService;
import com.tsl.service.KnowledgeService;
import com.tsl.utils.Page;
import com.tsl.vo.CodeVo;
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
@RequestMapping("/code")
public class CodeAction {

    @Autowired
    private CodeService codeService;

    @Autowired
    private KnowledgeService knowledgeService;

    public CodeService getCodeService() {
        return codeService;
    }

    public void setCodeService(CodeService codeService) {
        this.codeService = codeService;
    }

    @RequestMapping("/getAllCode.action")
    public ModelAndView getAllCode(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<CodeVo> list = codeService.getAllCode();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("codeList",list);
        md.setViewName("code");
        return md;
    }

    @RequestMapping("/deleteCode.action")
    public String deleteCode(int cid) throws Exception {
        codeService.deleteCode(cid);
        return "redirect:getAllCode.action";
    }

    @RequestMapping("/findCodeById.action")
    public ModelAndView findCodeById(int cid) throws Exception {
        CodeVo c= codeService.findCodeById(cid);
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("codeVo", c);
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("code-modify");
        return md;
    }

    @RequestMapping("/updateCode.action")
    public ModelAndView updateICode(CodeVo codeVo) throws Exception{
        codeService.updateCode(codeVo);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllCode.action");
        return md;
    }

    @RequestMapping("/newCode.action")
    public ModelAndView newCode() throws Exception{
        List<KnowledgeVo> knowledgeVoList = knowledgeService.getAllKnowledge();
        ModelAndView md = new ModelAndView();
        md.addObject("kkk",knowledgeVoList);
        md.setViewName("code-add");
        return md;
    }

    @RequestMapping("/addCode.action")
    public String addCode(CodeVo codeVo,MultipartFile canswerp1) throws Exception{

        String name = canswerp1.getOriginalFilename();

        String filetype = name.substring(name.lastIndexOf(".")) ;

        String filename =  UUID.randomUUID().toString() + filetype;

        File dest = new File("D:/fileupload/pic/" + filename);

        //上传文件
        canswerp1.transferTo(dest);

        codeVo.setCanswerp(filename);
        codeService.addCode(codeVo);
        return "redirect:getAllCode.action";
    }
}

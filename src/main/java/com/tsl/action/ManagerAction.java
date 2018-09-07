package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.Manager;
import com.tsl.service.ManagerService;
import com.tsl.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/host")
public class ManagerAction {

    @Autowired
    private ManagerService managerService;

    public ManagerService getManagerService() {
        return managerService;
    }

    public void setManagerService(ManagerService managerService) {
        this.managerService = managerService;
    }

    @RequestMapping("/login.action")
    public String login(String mname, String mpassword, HttpSession session,HttpServletRequest request, HttpServletResponse response) throws Exception{
        Manager manager = managerService.login(mname,mpassword);
        if (manager != null){
            session.setAttribute("manager", manager);
            return "redirect:/index/index.action" ;
        }else{
           return "redirect:login.html";
        }
    }
    //注销方法
    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return "redirect:login.html";
    }

    @RequestMapping("/getAllManager.action")
    public ModelAndView getAllManager(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<Manager> list = managerService.getAllManager();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("managerList",list);
        md.setViewName("host");
        return md;
    }

    @RequestMapping("/deleteManager.action")
    public String deleteManager(int mid) throws Exception {
        managerService.deleteManager(mid);
        return "redirect:getAllManager.action";
    }

    @RequestMapping("/findManagerById.action")
    public ModelAndView findManagerById(int mid) throws Exception {
        Manager m= managerService.findManagerById(mid);
        ModelAndView md = new ModelAndView();
        md.addObject("manager", m);
        md.setViewName("host-modify");
        return md;
    }

    @RequestMapping("/updateManager.action")
    public ModelAndView updateManager(Manager manager) throws Exception{
        managerService.updateManager(manager);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllManager.action");
        return md;
    }

    @RequestMapping("/newManager.action")
    public String newManager(){
        return "host-add";
    }

    @RequestMapping("/addManager.action")
    public ModelAndView addManager(Manager manager) throws Exception{
        managerService.addManager(manager);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllManager.action");
        return md;
    }

}

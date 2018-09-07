package com.tsl.action;

import com.tsl.model.Manager;
import com.tsl.model.User;
import com.tsl.service.ManagerService;
import com.tsl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserAction {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ManagerService managerService;

    @RequestMapping("/login.action")
    public User login(String name, String password, HttpServletRequest request, HttpSession session) throws Exception{
        String type = request.getParameter("type");
        if (type=="2"){
            Manager manager = managerService.login(name,password);
            session.setAttribute("manager", manager);
            return null;
            }
        return null;
        }
}

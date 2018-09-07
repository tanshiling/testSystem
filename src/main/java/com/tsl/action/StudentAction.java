package com.tsl.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsl.model.Student;
import com.tsl.service.StudentService;
import com.tsl.utils.Page;
import com.tsl.vo.JudgeQuesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentAction {

    @Autowired
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    @RequestMapping("/login.Action")
    public String login(String name, String password, HttpSession session) throws Exception{
        Student student = studentService.login(name,password);
        if (student!=null){
            session.setAttribute("student", student);
            return "redirect:/index.jsp" ;
        }else{
            return null;
        }
    }

    @RequestMapping("/getAllStudent.action")
    public ModelAndView getAllStudent(Page page) throws Exception{

        ModelAndView md = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<Student> list = studentService.getAllStudent();
        int total = (int) new PageInfo<>(list).getTotal();
        page.caculateLast(total);
        md.addObject("studentList",list);
        md.setViewName("student");
        return md;
    }

    @RequestMapping("/deleteStudent.action")
    public String deleteStudent(int stid) throws SQLException {
        studentService.deleteStudent(stid);
        return "redirect:getAllStudent.action";
    }

    @RequestMapping("/findStudentById.action")
    public ModelAndView findStudentById(int stid) throws SQLException {
        Student s= studentService.findStudentById(stid);
        ModelAndView md = new ModelAndView();
        md.addObject("student", s);
        md.setViewName("student-modify");
        return md;
    }

    @RequestMapping("/updateStudent.action")
    public ModelAndView updateStudent(Student student) throws Exception{
        studentService.updateStudent(student);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:getAllStudent.action");
        return md;
    }

    @RequestMapping("/newStudent.action")
    public String newStudent(){
        return "student-add";
    }

   /* @RequestMapping("/updateStudent.action")
    public ModelAndView updateStudent(int stid) throws SQLException {
        Student student = studentService.findStudentById(stid);
        //List<Student> list = studentService.getAllStudent();
        studentService.updateStudent(student);
        ModelAndView md = new ModelAndView();
        md.addObject("student",student);
        //md.addObject("list",list);
        md.setViewName("student-modify");
        return md;
    }
*/
       @RequestMapping("/addStudent.action")
       public ModelAndView addStudent(Student student) throws Exception{
           studentService.addStudent(student);
           ModelAndView md = new ModelAndView();
           md.setViewName("redirect:getAllStudent.action");
           return md;
       }

    /*public ModelAndView addStudent(Student student) throws SQLException {
        studentService.addStudent(student);
        ModelAndView md = new ModelAndView();
        md.setViewName("redirect:/getAllStudent.action");
        return md;
    }

    @RequestMapping("article/add")
    @ResponseBody
    public String addAtticle(String title, String abstractContent, String content, String author, String categoryId,String addCategory) {
        if (addCategory != null && addCategory !="") {
            String c_id = UUID.randomUUID().toString();
            Category category = new Category();
            category.setId(c_id);
            category.setName(addCategory);
            categoryService.addCate(category);
            categoryId=c_id;
        }
        String id = UUID.randomUUID().toString();
        Date current = new Date(System.currentTimeMillis());
        Article article = new Article();
        article.setId(id);
        article.setTitle(title);
        article.setAbstractContent(abstractContent);
        article.setContent(content);
        article.setAuthor(author);
        article.setCollectDate(current);
        article.setCategoryId(categoryId);
        int result = articleService.addArticle(article);
        System.out.println("成功");

        String stt = "成功";
        return stt;
    }*/
}

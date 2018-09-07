package com.tsl.service;

import com.tsl.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {

    //登录
    public Student login(String stname,String stpassword) throws Exception;

    //查询学生
    public List<Student> getAllStudent()throws SQLException;

    //添加学生
    public void addStudent(Student student)throws SQLException;

    //修改学生
    public void updateStudent(Student student)throws SQLException;

    //删除学生
    public void deleteStudent(int stid)throws SQLException;

    //根据id查找
    public Student findStudentById(int stid) throws SQLException;

}

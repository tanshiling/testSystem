package com.tsl.service.impl;

import com.tsl.dao.StudentDao;
import com.tsl.model.Student;
import com.tsl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    @Override
    public Student login(String stname, String stpassword) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        map.put("stname", stname) ;
        map.put("stpassword", stpassword) ;

        return studentDao.login(map);
    }

    @Override
    public List<Student> getAllStudent() throws SQLException {
        return studentDao.getAllStudent();
    }

    @Override
    public void addStudent(Student student) throws SQLException {
        studentDao.addStudent(student);
    }


    @Override
    public void updateStudent(Student student) throws SQLException {
        studentDao.updateStudent(student);
    }

    @Override
    public void deleteStudent(int stid) throws SQLException {
        studentDao.deleteStudent(stid);
    }

    @Override
    public Student findStudentById(int stid) throws SQLException {
        return studentDao.findStudentById(stid);
    }

}

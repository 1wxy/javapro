package com.neudu.test.service;

import com.neudu.test.dao.IStudentDao;
import com.neudu.test.dao.StudentDao;
import com.neudu.test.pojo.Student;

import java.util.List;

public class Studentservice implements IStudentservice {
    IStudentDao studentDao=new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();   //查询学生信息
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);   //添加信息
    }

    @Override
    public int updata(Student student) {
        return studentDao.updata(student);  //修改信息
    }

    @Override
    public int del(int Sno) {
        return studentDao.del(Sno); //删除方法
    }

    @Override
    public Student queryone(int Sno) {
        return null;
    }
}

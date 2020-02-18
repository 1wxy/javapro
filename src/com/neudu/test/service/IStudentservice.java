package com.neudu.test.service;

import com.neudu.test.pojo.Student;

import java.util.List;

public interface IStudentservice {
        List<Student> query();
        int add(Student student);
        int updata(Student student);
        int del(int Sno);
        Student queryone(int Sno);
}

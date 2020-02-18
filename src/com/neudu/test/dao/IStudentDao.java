package com.neudu.test.dao;

import com.neudu.test.pojo.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> query();
    int add(Student student);
    int updata(Student student);
    int del(int id);
    Student queryone(int id);
}

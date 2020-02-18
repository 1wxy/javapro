package com.neudu.test.pojo;

public class Student {
    private Integer Sno;
    private String Sname;
    private String Sex;
    private Integer Sage;

    public Student() {
    }

    public Student(Integer sno, String sname, String sex, Integer sage) {
        Sno = sno;
        Sname = sname;
        Sex = sex;
        Sage = sage;
    }

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getSage() {
        return Sage;
    }

    public void setSage(Integer sage) {
        Sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno=" + Sno +
                ", Sname='" + Sname + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Sage=" + Sage +
                '}';
    }
}

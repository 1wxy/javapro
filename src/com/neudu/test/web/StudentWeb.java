package com.neudu.test.web;

import com.neudu.test.pojo.Student;
import com.neudu.test.service.IStudentservice;
import com.neudu.test.service.Studentservice;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IStudentservice studentservice=new Studentservice();
    //菜单
    public  void showmain(){
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        System.out.println("1--------------------查询");
        System.out.println("2——----------------添加");
        System.out.println("3--------------------修改");
        System.out.println("4--------------------删除");
        System.out.println("其他-----------------退出");
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");

    }
    public void input(){
        //从键盘中获取值
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if (a==1){
            query();
        }else if (a==2){
            add(scanner);
        }else if (a==3){
            updata(scanner);
        }else if (a==4){
            del(scanner);
        }else {
            System.exit(0);
        }
    }
    //查询的方法
    public void query(){
        //调用服务层的方法 访问数据库
        List<Student> list=studentservice.query();
        for (Student student : list){
            System.out.println(student);
        }
    }
    //添加方法
    public void add(Scanner scanner){
        System.out.println("请输入学号");
        Integer Sno=scanner.nextInt();
        System.out.println("请输入姓名");
        String Sname=scanner.next();
        System.out.println("请输入性别");
        String Sex=scanner.next();
        System.out.println("请输入年龄");
        Integer Sage=scanner.nextInt();
        //调用服务层 添加信息
        Student student=new Student(Sno,Sname,Sex,Sage);
         studentservice.add(student);
         query();
    }
    //修改方法
    public void updata(Scanner scanner){
        System.out.println("请输入要学号");
        Integer Sno=scanner.nextInt();
        System.out.println("请输入姓名");
        String Sname=scanner.next();
        System.out.println("请输入性别");
        String Sex=scanner.next();
        System.out.println("请输入年龄");
        Integer Sage=scanner.nextInt();
        //调用服务层 添加信息
        Student student=new Student(Sno,Sname,Sex,Sage);
        studentservice.updata(student);
        query();
    }
    //删除方法
    public void del(Scanner scanner){
        System.out.println("请输入想要输入的学号：");
        int Sno=scanner.nextInt();
        //调用服务层
        studentservice.del(Sno);
        query();
    }
}

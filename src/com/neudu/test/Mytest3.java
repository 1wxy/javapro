package com.neudu.test;

import com.neudu.test.pojo.Dept;
import com.neudu.test.util.JdbcUtil;
import com.neudu.test.web.StudentWeb;

import java.util.List;

public class Mytest3 {
    public static void main(String[] args) {
        StudentWeb studentWeb=new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();

        Class clz = Dept.class;
        List<Dept> list = JdbcUtil.executeQuery("select deptno,dname,loc from dept",Dept.class);
        System.out.println(list);



       // 动态数组
        // System.out.println(add(1,2,3,4));
    }
    //动态数组
    public static int add(int b,int...array){
        int sum=0;
        for (int a:array){
            sum+=a;
        }
        return sum;
    }
}

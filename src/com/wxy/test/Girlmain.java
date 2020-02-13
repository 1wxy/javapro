package com.wxy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Girlmain {
    public static Girl[] girls=new Girl[100];
   public static List<Girl> list=new ArrayList<>();
    public static void main(String[] args) {

    }
    //菜单
    public static void menu(){
        System.out.println("输入菜单项请选择你要进行的操作（请输入1-4中的任一个数字）");
        System.out.println("1：根据条件查询适合你的女朋友");
        System.out.println("2：随缘查找");
        System.out.println("3：我的女鹏友");
        System.out.println("4：退出系统");
    }
    //录入女朋友
    private static void inputdata(List<Girl> girls){
        System.out.println("首次运行系统，请录入你的女朋友");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您女朋友的名字");
        String name=scanner.next();
        System.out.println("请输入您女朋友的性别");
        String sex=scanner.next();
        System.out.println("请输入您女朋友的电话");
        String tel=scanner.next();
        System.out.println("请输入您女朋友的关键字");
        String shuxing=scanner.next();
        Girl girl=new Girl(name,sex,tel,shuxing);
        girls.add(girl);
    }
}

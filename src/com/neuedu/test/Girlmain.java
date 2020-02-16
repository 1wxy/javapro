package com.neuedu.test;

import com.wxy.test.Girl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Girlmain {
    public static Girl[] girls=new Girl[100];
    public static List<Girl> list=new ArrayList<>();
    public static void main(String[] args) {
            menu();
    }
    //菜单
    public static void menu(){
        System.out.println("输入菜单项请选择您要进行的操作（新用户请先添加您的女朋友信息）");
        System.out.println("1：根据条件查询适合您的女朋友");
        System.out.println("2：随缘查找");
        System.out.println("3：添加我的女朋友");
        System.out.println("4：查看我的女朋友");
        System.out.println("5：退出系统");
        System.out.println("请输入您想进行的操作：");
        Scanner scanner=new Scanner(System.in);    //获取标号  要进行的操作
        int a=scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("请输入您想要查找的女朋友的关键字");
                Scanner scanner1 = new Scanner(System.in);
                String search = scanner1.next();
                search(list, search);
                break;
            case 2:
                suisearch();
            case 3:
                inputdata(list);
                break;
            case 4:
                show(list);
                break;
            default:
                System.exit(1);

        }

    }
    //录入女朋友
    private static void inputdata(List<Girl> girls){
        System.out.println("首次运行系统，请先录入您的女朋友:");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您女朋友的名字：");
        String name=scanner.next();
        System.out.println("请输入您女朋友的性别：");
        String sex=scanner.next();
        System.out.println("请输入您女朋友的电话：");
        String tel=scanner.next();
        System.out.println("请输入您女朋友的关键字：");
        String shuxing=scanner.next();
        Girl girl=new Girl(name,sex,tel,shuxing);
        girls.add(girl);
        System.out.println();
        System.out.println("哇，这么快就填写完成了，！");
        System.out.println("请继续您想进行的操作：");
        System.out.println();
        menu();
    }
    //输出女朋友信息
    public static void show(List<Girl> girls){
        for (int i=0;i<girls.size();i++){
            System.out.println(girls.get(i));
        }
        System.out.println();
        System.out.println("，最想对您的女朋友说什么：");
        Scanner scanner=new Scanner(System.in);
        String b=scanner.next();
        if (b.equals("我爱你！")) {
            System.out.println("");
        }
        System.out.println("\n\n\n");
        menu();

    }
    //根据条件查询
    public static void search(List<Girl> girls,String shuxing){
        for (int i=0;i<girls.size();i++){
           boolean flag=true;
            Girl girl=girls.get(i);
            if (girl.getShuxing().equals("我爱你")){
                flag=true;
            }
            System.out.println();
            System.out.println("山有木兮木有枝，心悦君兮君不知");
            System.out.println("您有这么好的女朋友，好好珍惜吧！\n");
        }
        menu();
    }
    //随缘查找
    public static void suisearch(){
        System.out.println("帅哥放弃吧，最好的已经在您身边了！");
        System.out.println("如果您执意操作，我们将电话联系您的女朋友！");
        System.out.println();
        System.out.println("请考虑是否继续查找：");
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        if (a.equals("不找了")){
            System.out.println("今天是情人节，祝您和您的爱人永远幸福！");
            System.out.println();
        }else{
            System.out.println("操作错误");
        }

        menu();
    }

}

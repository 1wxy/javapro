package com.neudu.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookMain {
    public  static   Mybook[] books=new Mybook[200];
    public  static  List<Mybook> list=new ArrayList<>();
    public  static File file=new File("f:/books");
    //main方法
    public static void main(String[] args) {
        if (!file.exists()) {      //判断是否有books文件，如果没有就创建
            inputData(list);
            save();
        }else {
            read();                //如果已经有books文件，经执行read，往里写
        }
         menu();

    }
    //菜单
    public static void menu(){
        System.out.println("输入菜单项请选择你要进行的操作（请输入1-4中的任一个数字）");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：输出所有图书信息");
        System.out.println("5：退出当用户");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        switch (i){
            case 1: addBook(list);
                break;
            case 2:
                System.out.println("请输入要删除的书名");
                String name=scanner.next();
                deleteName(list,name);
                break;
            case 3:
                System.out.println("请输入想要查找的书名");
                String searchname=scanner.next();
                searchName(list,searchname);
                break;
            case 4:print(list);
                break;
            default:
                System.exit(1);

        }

    }
    //录入图书
    public static void inputData(List<Mybook> books){
        Scanner scanner=new Scanner(System.in);
        System.out.print("首次运行系统，请输入初始化数据");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            Mybook mybook=new Mybook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"作者"+i,"ISBN"+i);
            books.add(mybook);
        }
        menu();
    }
    //输出所有图书信息
    public static void print(List<Mybook> books){
        for (int i=0;i<books.size();i++){
            System.out.println(books.get(i));
        }
        menu();
    }
    //查询图书
    public static void searchName(List<Mybook> books, String name){
        for (int i=0;i<books.size();i++){
            Mybook mybook=books.get(i);
            if (mybook.getName().equals(name)) {
                System.out.println(mybook);
                menu();
               return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }
    //删除图书
    public static void deleteName(List<Mybook> books, String name){
        for (int i=0;i<books.size();i++){
            Mybook mybook=books.get(i);
            if (mybook.getName().equals(name)){
                books.remove(i);
                System.out.println("删除成功");
                save();
                menu();
                return;
            }
        }
        System.out.println("查无此书，删除失败");
        menu();
    }
    //添加图书
    public static void addBook(List<Mybook> books){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名");
        String name=scanner.next();
        System.out.println("请输入价格");
        double price=scanner.nextDouble();
        System.out.println("请输入出版社");
        String press=scanner.next();
        System.out.println("请输入作者");
        String author=scanner.next();
        System.out.println("请输入ISBN号");
        String bookISBN=scanner.next();
        Mybook mybook=new Mybook(name,price,press,author,bookISBN);
        books.add(mybook);
        save();
        System.out.println("添加成功");
        menu();
    }
    //输出流 存数据
    public static void save(){
        OutputStream os=null;
        ObjectOutputStream oos=null;
        try {
             os=new FileOutputStream(file);
             oos=new ObjectOutputStream(os);
             oos.writeObject(list);
             oos.flush();
             os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oos!=null)
                     oos.close();
                if (os!=null)
                     os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //输入流
    public static void read(){
        InputStream is= null;
        ObjectInputStream ois=null;
        try {
            is = new FileInputStream(file);
            ois=new ObjectInputStream(is);
           list= (List<Mybook>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois!=null)
                      ois.close();
                if (is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

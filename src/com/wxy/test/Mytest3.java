package com.wxy.test;

import javafx.scene.transform.Scale;
import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.Scanner;

public class Mytest3 {
    public static void main(String[] args) {
       /* //将A文件的内容复制到B文件中
        //声明输入输出流
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
                File file1=new File("d:\\1.txt");
                fis=new FileInputStream(file1);
                //创建byte数组
                byte[] b=new byte[1024];
                fis.read(b);
                //要写入的文件路径
                File file2=new File("d:\\a\\b.txt");
                fos=new FileOutputStream(file2,true);
                fos.write(b,0,(int)file1.length());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/

       //FILE类
      /* File file=new File("f:/books");
        System.out.println("文件名称："+file.getName());
        System.out.println("文件大小："+file.length());
        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件的路径是："+file.getPath());
        try {
            System.out.println("是否创建了新文件"+file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("是否是文件："+file.isFile());
        System.out.println("是否是目录："+file.isDirectory());
        File file1=new File("f:/abc/a/b");
        System.out.println(file1.delete());*/

      //字节输出流
       /* File f1=new File("f:/a.txt");
        try {
            OutputStream outputStream=new FileOutputStream(f1,true);
            String a="\0 111111111111";
            outputStream.write(a.getBytes());
            outputStream.flush();
            outputStream.close();
            System.out.println("操作完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
       //字节输入流
       /* InputStream inputStream=null;
        try {
            inputStream=new FileInputStream("f:a.txt");
            byte[] b=new byte[100];
            System.out.println(inputStream.read(b));

            System.out.println(new String(b));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (inputStream!=null)
                     inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


       /**
        * 输出斐波那契数列  以 1 1 开头 后面每一位都是前两位之和
        * 1 1 2 3 5 8 13
        *
        **/
       /* Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(method(n));*/

        /**
         * 一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高
         *
         *
         * */
        /*System.out.println(method2(100));*/
        /**
         * 一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
         *
         * */
        for (int i=1;i<10000;i++){

           int x=(int)Math.sqrt(i+100);
            int y=(int)Math.sqrt(i+168);
            if (x*x==i+100&&y*y==i+168)
                  System.out.println(i);
        }

    }
    //定义一个method方法  输出第n个斐波那契数
   /* public static int method(int n){
        if (n==1||n==2){
            return 1;
        }else {
            int a=1,b=1,sum;
            for (int i=2;i<n;i++){
                sum=a+b;
                a=b;
                b=sum;
            }
            return b;
        }

    }*/



}

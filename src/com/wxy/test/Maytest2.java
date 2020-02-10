package com.wxy.test;



import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Maytest2 {
    public static void main(String[] args) {
       List arrayList=new ArrayList();
       List linkedList=new LinkedList();
       Date startarray=new Date();
       for (int i=0;i<100000;i++){
           arrayList.add(i);
       }
       Date endarray=new Date();
        System.out.println("ArrayList的添加时间是"+(endarray.getTime()-startarray.getTime()));

      Date startlinked=new Date();
      for (int j=0;j<100000;j++){
          linkedList.add(j);
      }
      Date endlinked=new Date();
        System.out.println("LinkedList的添加时间是"+(endlinked.getTime()-startlinked.getTime()));

        //读取时间
        Date startreadarray=new Date();
        for (int k=0;k<arrayList.size();k++){
            Object obj=arrayList.get(k);
        }
        Date endreadarray=new Date();
        System.out.println("ArrayList的读取时间是"+(endreadarray.getTime()-startreadarray.getTime()));
        Date startreadlinked=new Date();
        for (int m=0;m<linkedList.size();m++){
            Object obj=linkedList.get(m);
        }
        Date endreadlinked=new Date();
        System.out.println("LinkedList的读取时间是"+(endreadlinked.getTime()-startreadlinked.getTime()));
    }
}

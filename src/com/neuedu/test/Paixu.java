package com.neuedu.test;

public class Paixu {
    public static void main(String[] args) {
        //冒泡排序
        //相邻两个数比较大小 然后交换位置
        // int[] array={1,2,89,23,14,66,77,5,8,};
        /*for (int i=0;i<array.length-1;i++){
            int flag=0;
            for (int j=0;j<array.length-1-i;j++){
                  if (array[j]>array[j+1]){
                      int temp=array[j+1];
                      array[j+1]=array[j];
                      array[j]=temp;
                      flag++;
                  }
            }
            if (flag==0){
                break;
            }
        }
        for (int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }*/


        //选择排序   每一个数比较大小 然后交换位置
     /*  for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        for (int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }*/


       // 二分查找
        /*int[] array=new int[100000];
          for (int i=0;i<array.length;i++){
              array[i]=i+1;
          }
          int a=80000;
            int index=search(array,a);
        System.out.println(index);
    }
    //从array中找到value的索引
    public static int find(int[] array,int value){
        int index=-1;
        for (int i=0;i<array.length;i++){
            if (array[i]==value){
                return i;
            }
        }
        return index;
    }
     //二分搜索查询
    public static int search(int[] array,int value){
        int min=0;
        int max=array.length-1;
        int mid;
        int count=0;
        while(min<=max){
            count++;
            mid=(min+max)/2;
            if (value==array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if (value<array[mid]){
                max=mid-1;
            }else {
                min=mid+1;
            }
        }
        return -1;*/
    }
}

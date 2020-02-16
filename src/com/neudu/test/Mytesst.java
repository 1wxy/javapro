package com.neudu.test;

public class Mytesst{
    public static void main(String[] args) {
        //判断是否是闰年
        int year=2020;
        if ((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
        //输出1-100的和
        method(100);
        //1-100的质数和
        method1();
        //1234没有重复的组合数
        method2();
        //1-100中的偶数
        method3();
        //m 的 n 次方
        method4();
        //100-999之间的水仙花数  例153 1^3+5^3+3^3=153
        method5();
        //两个正整数 计算最大公约数和最小公倍数
        method6();
    }
    //1-100的和
    public static void  method(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("1-"+n+"的和为："+sum);
    }
    //1-100的质数和
    public static void method1(){
        int sum=0;
        for (int i=2;i<=100;i++){
            boolean flag=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    flag=false;
                }
            }
            if (flag==true){
                sum=sum+i;
            }
        }
        System.out.println("1-100的质数和为："+sum);
    }
    //1234没有重复的组合数
    public static void method2(){
        for (int i=1;i<5;i++){
            int bai=i*100;
            for (int j=1;j<5;j++){
                int shi=j*10;
                int baishi=0;
                if (i!=j){
                    baishi=bai+shi;
                }
                for (int k=1;k<5;k++){
                    if (i!=j&&i!=k&&j!=k){
                        int he=baishi+k;
                        System.out.println(he);
                    }
                }
            }
        }
    }
    //1-100中的偶数和
    public static void method3(){
        int sum=0;
        for (int i=0;i<=100;i++){
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("1-100的偶数和为："+sum);
    }
    //m 的 n 次方
    public static void method4(){
        int m=2;
        int n=3;
        int sum=1;
        for (int i=1;i<=n;i++){
            sum=sum*m;
        }
        System.out.println(m+"的"+n+"次方为："+sum);
    }
    //100-999之间的水仙花数  例153 1^3+5^3+3^3=153
    public static void method5(){
        for (int i=100;i<=999;i++){
            int bai=i/100;
            int shi=i%100/10;
            int ge=i%100%10;
            if (bai*bai*bai+shi*shi*shi+ge*ge*ge==i){
                System.out.println("水仙花数为："+i);
            }
        }

    }
    //两个正整数 计算最大公约数和最小公倍数
    public static void method6(){
        int a=600;
        int b=256;
        int max=1;
        //最大公约数
        for (int i=1;i<a&&i<b;i++){
            if (a%i==0&&b%i==0){
                max=i;
            }
        }
        System.out.println(a+"和"+b+"的最大公约数为："+max);
        //最小公倍数
        int min=1;
        for (int j=c();j<a*b;j++){    //最小公倍数是两个数的乘积
            if (j%a==0&&j%b==0){
                min=j;
                break;              //如果不加break  则会继续循环，可能的到的不是最小
            }
        }
        System.out.println(a+"和"+b+"的最小公倍数为："+min);
    }
    public static int c(){
        int a=600,b=256,c=0;
        return (a>b)?a:b;
    }
}

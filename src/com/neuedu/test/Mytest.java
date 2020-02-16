package com.neuedu.test;

public class Mytest {
    public static void main(String[] args) {
        /* Dog p1=new Dog();
         int a=p1.num=1;
         p1.setAge(12);
         int p=p1.getAge();
         p1.setSex('m');
         int b=p1.getSex();
            System.out.println(a);
            System.out.println(p);
            System.out.println(b);*/
      /* int a=2020;
       if((a%4==0&&a%100!=0)||a%400==0){
         System.out.print("闰年");
       }else{
           System.out.print("不是");
       }*/
      /*  int sum=0;
        int a=1;
        do{
            sum=sum+a;
            a=a+1;
        }while(a<=100);
            System.out.println(sum);
            int p=0;
            for(int b=1;b<=100;b++){
               p=p+b;
            }
            System.out.print(p);*/
     /*int sum=0;
      for (int i=2;i<=100;i++) {
          boolean flag=true;
          for (int a = 2; a < i; a++){
              if (i%a == 0) {
                  flag = false;
              }
          }
          if (flag == true) {
              sum = sum + i;
          }
      }
        System.out.print(sum);*/
    /* int p=Dog.add(1,2);
        System.out.println(p);
        Dog m=new Dog();
         int q=m.add(1,2,3);
        System.out.print(q);*/

        //1234中任选三位数组合
     /*  int[] array={1,2,3,4};
        for (int i=0;i<array.length;i++){
            for (int a=0;a<array.length;a++){
                if (i!=a){
                    for (int k=0;k<array.length;k++){
                        if (i!=k&&a!=k){
                            System.out.println(100*array[i]+10*array[a]+array[k]);
                        }
                    }
                }
            }
        }*/

        //1-100中的偶数
       /*int sum=0;
        for(int i=1;i<=100;i++){
            boolean flag=false;
            if (i%2==0){
                flag=true;
            }
           if (flag==true){
                sum+=i;
           }
        }
        System.out.println(sum);*/

        //m的n次方
       /* int m=2,n=3,sum=1;
        for (int i=1;i<=n;i++){
            sum=sum*m;
        }
        System.out.println(sum);*/

        //100-999之间的水仙花数  例153 1^3+5^3+3^3=153
        /*for (int i=100;i<=999;i++){
            //取百位
            int a=i/100;
            //取十位
            int b=i%100/10;
            //取个位
            int c=i%100%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }*/

        //两个正整数  计算最大公约数和最小公倍数
        //公约数
      /*int a=600;
        int b=256;
        int max=1;
        for (int i=1;i<a&&i<b;i++){
            if (a%i==0&&b%i==0){
                 max=i;
            }
        }
        System.out.println(max);
        //最小公倍数
        int min=max(a,b);
        for (int i=min;i<a*b;i++){
            if (i%a==0&&i%b==0){
                min=i;
                break;
            }
        }
        System.out.println(min);*/

    }

  public static int max(int a,int b){
        return (a>b)?a:b;
    }

}

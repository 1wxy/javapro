package com.wxy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mytest5 {
    public static void main(String[] args) {
        //输入游戏人数
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if (num<12||num>18){
            System.out.println("人数不符合游戏规则，请重新输入");
        }else {
            System.out.println("人数符合，现在发牌");
            //创建三个列表
            List<String> all=new ArrayList<>();  //总的牌
            List<String> play=new ArrayList<>(); //玩家手中的牌
            List<String> di=new ArrayList<>();   //底牌
            init(all);
            pai(all,num);
            //底牌中不允许有盗贼
            all.remove("盗贼"); //从总牌中移除盗贼
            play.add("盗贼");       //把盗贼添加到玩家手中的牌中
            dipai(all,di);          //执行函数  抽取三张底牌
            play.addAll(all);       //把抽完底牌的牌放入 玩家手中
            System.out.println("玩家牌："+play);
            System.out.println("底牌："+di);

        }
    }
    //游戏初始化，符合游戏最低人数就是12人，十五张牌
    // 定义方法的目的是在main中调用    是为了让main方法看起来简洁
    public static void init(List<String> list){
       //添加牌
        for (int i=0;i<4;i++){
            list.add("狼人");
        }
        for (int j=0;j<4;j++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("村长");
        list.add("猎人");
        list.add("盗贼");
    }
    //根据不同人数添加不同的牌
    public static void pai(List<String> list,int num){
        if (num>12)
            list.add("村民");
        if (num>13)
            list.add("替罪羊");
        if (num>14)
            list.add("狼人");
        if (num>15)
            list.add("村民");
        if (num>16)
            list.add("狼人");
        if (num>13)
            list.add("吹笛者");
    }
    //底牌    从总牌中任意拿出三张作为底牌
    public static void dipai(List<String> list,List<String> di){
        while (di.size()<3){
            Random random=new Random();        //取list一个随机下标（list是总和）
            int index=random.nextInt(list.size());
            if (di.contains("狼人")&&list.get(index).equals("狼人")){
                continue;
            }else{
                di.add(list.remove(index));
            }
        }


    }
}

package com.itheima_anli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    斗地主综合案例：
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
*/
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存花色，一个存序号
        String[] colors = new String[]{"♠","♥","♣","♦"};
        String[] numbers = new String[]{"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存储到poker集合中--没花色
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }
        System.out.println(poker); //与下一行代码等价，重写了toString()方法。
//        System.out.println(poker.toString());
        /*
            2.洗牌
            使用集合的工具类Collections中的方法:
            public static void shuffle(List<?> list)使用默认随机源对指定列表进行置换。
        */
        Collections.shuffle(poker);
        System.out.println(poker);
        /*
            3.发牌：
            定义四个集合存储玩家的牌和底牌
        */
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        /*
            遍历poker集合，获取每一张牌
            使用poker集合的索引%3给每个玩家轮流发牌
            剩余3张牌给底牌
            注意：
                先判断底牌（i>=51）,否则牌就发没了
        */
        for (int i = 0; i < poker.size(); i++) {
            //获取当前牌
            String p = poker.get(i);
            if(i>=51){
                dipai.add(p);
            }else{
                switch (i%3){
                    case 0:
                        player1.add(p);
                        break;
                    case 1:
                        player2.add(p);
                        break;
                    case 2:
                        player3.add(p);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println("player1:");
        System.out.println(player1);
        System.out.println("player2:");
        System.out.println(player2);
        System.out.println("player3:");
        System.out.println(player3);
        System.out.println("底牌:");
        System.out.println(dipai);
    }
}

package com.itheima.demo05.Debug;

import java.util.*;

/*
    斗地主：有序版--使用HashMap？
*/
public class Test01 {
    public static void main(String[] args) {
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        //1.定义花色、数字
        List<String> colors = List.of("♥", "♠", "♦", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        HashMap<Integer, String> mapPoker = new HashMap<>();
        mapPoker.put(0, "大王");
        mapPoker.put(1, "小王");
        //存放洗好的数字编号
        ArrayList<Integer> p1Num = new ArrayList<>();
        ArrayList<Integer> p2Num = new ArrayList<>();
        ArrayList<Integer> p3Num = new ArrayList<>();
        ArrayList<Integer> dipaiNum = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //2.创建poker牌
        int i = 2;
        for (String number : numbers) {
            for (String color : colors) {
                mapPoker.put(i++, (color + number));
            }
        }
//        System.out.println(mapPoker);
        //entrySet
        Set<Map.Entry<Integer, String>> entrySet = mapPoker.entrySet();
        /*for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry);
        }*/
        //3.洗牌、分牌
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < 54; j++) {
            arrayList.add(j);
        }
        Collections.shuffle(arrayList);
        for (int j = 0; j < 54; j++) {
            if(j>=51){
                dipaiNum.add(arrayList.get(j));
            }else {
                switch (j%3){
                    case 0:
                        p1Num.add(arrayList.get(j));
                        break;
                    case 1:
                        p2Num.add(arrayList.get(j));
                        break;
                    case 2:
                        p3Num.add(arrayList.get(j));
                        break;
                    default:
                        break;
                }
            }
        }
        //将发好的牌整理好
        Collections.sort(p1Num);
        Collections.sort(p2Num);
        Collections.sort(p3Num);
        Collections.sort(dipaiNum);
        //4.根据键找值，存键值对
        for (int j = 0; j < p1Num.size(); j++) {
            player1.add(mapPoker.get(p1Num.get(j)));
        }
        for (int j = 0; j < p2Num.size(); j++) {
            player2.add(mapPoker.get(p2Num.get(j)));
        }
        for (int j = 0; j < p3Num.size(); j++) {
            player3.add(mapPoker.get(p3Num.get(j)));
        }
        for (int j = 0; j < dipaiNum.size(); j++) {
            dipai.add(mapPoker.get(dipaiNum.get(j)));
        }
        map.put("周星驰", player1);
        map.put("曹达华", player2);
        map.put("周润发", player3);
        map.put("底牌", dipai);
        Set<Map.Entry<String, List<String>>> set = map.entrySet();
        for (Map.Entry<String, List<String>> entry : set) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}

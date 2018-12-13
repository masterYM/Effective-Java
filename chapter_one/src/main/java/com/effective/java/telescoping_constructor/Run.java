package com.effective.java.telescoping_constructor;

import java.util.Date;

public class Run {
    public static void main(String[] args) {
//        NutritionFacts1 cocaCola =
//                new NutritionFacts1.Builder(240,5).calories(100).fat(33).sodium(33).build();
//        System.out.println(cocaCola);
//        NutritionFacts n = new NutritionFacts(20,23);

        long start = System.currentTimeMillis();
//        Long sum = 0L;//9560=end-start
        long sum = 0L;//780=end-start
        for(long i = 0;i<Integer.MAX_VALUE;i++){
            sum += i;//如果是Long 每到这里一次就会创建一个Long对象
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(sum);



    }
}

package com.effective.java.telescoping_constructor;

public class Run {
    public static void main(String[] args) {
        NutritionFacts1 cocaCola =
                new NutritionFacts1.Builder(240,5).calories(100).fat(33).sodium(33).build();
        System.out.println(cocaCola);
        NutritionFacts n = new NutritionFacts(20,23);

    }
}

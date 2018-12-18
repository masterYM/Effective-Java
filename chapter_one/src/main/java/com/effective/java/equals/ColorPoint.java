package com.effective.java.equals;

import java.awt.*;

public class ColorPoint extends Point {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        ColorPoint cp = new ColorPoint(1,2,Color.RED);
        System.out.println(point.equals(cp));//true
        System.out.println(cp.equals(point));//false
    }

    private final Color color;

    public ColorPoint(int x,int y,Color color){
        super(x,y);
        this.color = color;
    }

//    @Override //混合比较时不起作用
//    public boolean equals(Object obj) {
//        if(!(obj instanceof ColorPoint)){
//            return false;
//        }
//        return super.equals(obj) && ((ColorPoint) obj).color == color;
//    }

    @Override //可以混合比较，但是牺牲了传递性
    public boolean equals(Object obj) {
        if(!(obj instanceof Point)){
            return false;
        }
        if(!(obj instanceof ColorPoint)){
            return obj.equals(this);
        }
        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }
}

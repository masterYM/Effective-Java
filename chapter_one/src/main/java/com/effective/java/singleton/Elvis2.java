package com.effective.java.singleton;

import java.io.Serializable;

/**
 * ###用私有构造器或者枚举类型强化Singleton属性
 *
 *
 *
 * 为了使利用这其中一种方法实现的Singleton类变成是可序列化的，仅仅在声明中加上 implements Serializable 是不够的。
 * 为了维护并保证Singleton，必须声明所有实例域都是瞬时的，并提供一个readResolve方法，否则，每次反序列化一个序列化的实例时
 * 都会创建一个实例；
 */
public class Elvis2 implements Serializable {

    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2(){}
    public static Elvis2 getInstance(){return INSTANCE;}
    public void leaveTheBuilding(){}

    private Object readResolve(){
        return INSTANCE;
    }


    /**
     * 单元素的枚举类型已经成为实现Singleton的最佳方法
     */
    public enum Elvis{
        INSTANC;
        public void leaveTheBuilding(){}
    }
}

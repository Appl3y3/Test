package com.appleye.utils;

/**
 * @author Appleye
 * @time 2019/10/15 0015 17:51
 */
public class Single_hungry {
    private Single_hungry(){}

    private static Single_hungry single_hungry = new Single_hungry();

    public static Single_hungry getInstance(){
        return single_hungry;
    }
}

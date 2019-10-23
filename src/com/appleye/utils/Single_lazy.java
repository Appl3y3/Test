package com.appleye.utils;

/**
 * @author Appleye
 * @time 2019/10/15 0015 17:48
 */
public class Single_lazy {
    private Single_lazy(){}

    private static Single_lazy single_lazy;

    public synchronized static Single_lazy getInstance(){
        if (single_lazy == null) return new Single_lazy();
        return single_lazy;
    }
}


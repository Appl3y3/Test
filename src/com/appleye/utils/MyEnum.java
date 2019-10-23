package com.appleye.utils;

/**
 * @author Appleye
 * @version 1.0
 * @date 2019/10/22 0022
 * @time 09:12
 */
public enum MyEnum implements BaseInterface{

    FIRST(1,"safe"),
    SECOND(2,"dangerous");

    private Integer code;
    private String means;

    private MyEnum(Integer code, String means){
        this.code = code;
        this.means = means;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMeans() {
        return means;
    }
}

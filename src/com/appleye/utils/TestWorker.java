package com.appleye.utils;

import java.io.Serializable;

/**
 * @author Appleye
 * @time 2019/10/11 0011 11:20
 */
public class TestWorker implements Serializable {
    private Integer age;
    private String name;

    public TestWorker() {
    }

    public TestWorker(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    @Override
//    public String toString() {
//        return "TestWorker{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
}

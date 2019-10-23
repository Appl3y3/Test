package com.appleye.utils;

/**
 * @author Appleye
 * @time 2019/10/15 0015 16:56
 */
public class CustomNode {
    Integer value;
    CustomNode left;
    CustomNode right;

    public CustomNode(Integer value) {
        this.value = value;
    }

    /**
     * 添加
     * @param value
     */
    public void put(Integer value) {
        if (value > this.value) {
            if (right == null) {
                right = new CustomNode(value);
            } else {
                right.put(value);
            }
        } else {
            if (left == null) {
                left = new CustomNode(value);
            } else {
                left.put(value);
            }
        }
    }

    /**
     * 查找是否存在
     * @param value
     * @return
     */
    public boolean exist(Integer value) {

        if (this.value == value) return true;
        if (value < this.value) {
            if (left == null) return false;
                return left.exist(value);
        } else {
            if (right == null) return false;
                return right.exist(value);
        }

    }

    /**
     * 打印全部
     */
    public void print() {
        System.out.print(this.value + ",");
        if (left != null) left.print();
        if (right != null) right.print();

    }


}

package com.appleye.utils;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.List;

public class Tools{

    /**
     * 斐波那契数
     * @param x 斐波那契数列的第x项
     * @return 斐波那契数列的第x项的值
     */
    public static int fb(int x){
        if(x < 3) return x - 1;
        else return fb(x - 2) + fb(x - 1);
    }

    /**
     * 判断是否素数
     * @return 是否为素数
     */
    public static boolean su(int x){
        for(int i = 2;i < Math.sqrt(x);i++){
            if(x % i == 0) return false;
        }
        return true;
    }


    /**
     * 数组两数互换位置
     * @param arr
     * @param index1
     * @param index2
     */
    public static void twoSwitch(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    /**
     * 两数最大公约数
     * @param x
     * @param y
     * @return
     */
    public static int yue(int x,int y){
        //if(y == 0) return x;
        //return yue(y,x % y);
        return y == 0 ? x : yue(y,x % y);

    }

    /**
     * 归并排序 - 合并
     */
    public static int[] merge(int[] x, int[] y){
        int[] z = new int[x.length + y.length];
        int j = 0,k = 0;

        for (int i = 0; i < z.length; i++) {
            if (j < x.length && k < y.length) {
                z[i] = x[j] <= y[k] ? x[j++] : y[k++];
            }else if(j >= x.length){
                z[i] = y[k++];
            }else if(k >= y.length){
                z[i] = x[j++];
            }
        }
        return z;
    }

    /**
     * 归并排序
     * @param x
     */
    public static int[] merge_sort(int[] x){
        //如果数组长度<=1，无需排序直接返回
        if (x.length <= 1) return x;

        //数组长度>1,拆分排序
        int[] left = merge_sort(apart_arr(x, "left"));
        int[] right = merge_sort(apart_arr(x, "right"));


        return merge(left, right);

    }

    /**
     * 拆分数组(获取数组的前/后半部分)
     * @param arr
     * @param str left左边，right右边
     * @return .eg 2+2 or 2+3
     * 边界问题很恶心
     */
    public static int[] apart_arr(int[] arr, String str){

        if(arr.length == 1) return arr;

        int mid = getMid(arr);
        int start = 0;
        int end = 0;
        switch (str) {
            case "left":
                start = 0;
                end = mid;
                break;
            case "right":
                start = mid;
                end = arr.length;
                break;
            default:
                break;
        }
        int[] get_arr = new int[end - start];
        for (int i = start,j = 0; i < end; i++,j++) {
            get_arr[j] = arr[i];
        }
        return get_arr;
    }

    /**
     * 获取数组下标中间值
     * @return .eg: {0 1 2 3} 返回 2
     */
    public static int getMid(int[] arr){
        return arr.length/2;
    }

    /**
     * 数组转换为字符串
     * @param arr
     * @return
     */
    public static String toString(int[] arr){

        StringBuffer sb = new StringBuffer();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append("," + arr[i]);
        }
        return sb.toString();
    }

    /**
     * 快速排序
     * @param arr
     * @return
     */
    public static void quickSort(int[] arr, int low, int high){

        if(low > high) return;

        int i = low;
        int j = high;
        int temp = arr[low];

        while(i < j){
            while(temp <= arr[j] && i < j) j--;
            while(temp >= arr[i] && i < j) i++;

            if(i < j) {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }

        arr[low] = arr[i];
        arr[i] = temp;

        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    /**
     * 数组合并
     * @param arr1
     * @param arr2
     * @return
     */
    public static int[] mergeArr(int[] arr1, int[] arr2){
        int len = arr1.length + arr2.length;
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            if(i < arr1.length) arr[i] = arr1[i];
            else arr[i] = arr2[i - arr1.length];
        }
        return arr;
    }

    /**
     * 快速排序2
     * @param strDate
     * @param left
     * @param right
     */
    public static void quickSort(String[] strDate,int left,int right){
        String middle,tempDate;
        int i,j;
        i = left;
        j = right;
        middle = strDate[(i+j)/2];
        do{
            while(strDate[i].compareTo(middle) < 0 && i < right)
                i++; //找出左边比中间值大的数
            while(strDate[j].compareTo(middle) > 0 && j > left)
                j--; //找出右边比中间值小的数
            if(i <= j){ //将左边大的数和右边小的数进行替换
                tempDate = strDate[i];
                strDate[i] = strDate[j];
                strDate[j] = tempDate;
                i++;
                j--;
            }
        }while(i <= j); //当两者交错时停止

        if(i < right){
            quickSort(strDate,i,right);//从
        }
        if(j > left){
            quickSort(strDate,left,j);
        }
    }


    /**
     * 快速排序2_self
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort_self(List<Integer> arr, int left, int right) {

        //左右游标初始化
        int i = left;
        int j = right;
        //中介值
        int temp = arr.get(i);
        while (i <= j) {
            //如果左游标的value小于(不能小于等于)中介值 & 左游标没有超过右边界，左游标继续右移
            while (arr.get(i) < temp && i <= right) i++;
            //右游标同理
            while (arr.get(j) > temp && j >= left) j--;

            //左右游标的value互换
            if (i <= j) {//i++,j--后i可能大于j，所有还要判断
                int num = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, num);
                //互换之后，ij继续前进
                i++;
                j--;
            }
        }

        if (i <= right) quickSort_self(arr,i,right);
        if (j >= left) quickSort_self(arr,left,j);


    }

    /**
     * 互换两数
     * @param a
     * @param b
     */
    public static void twoSwitch(Integer a, Integer b) {
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
        Integer temp = new Integer(a);
        Class clazz = a.getClass();
        try {
            Field field = clazz.getDeclaredField("value");
            field.setAccessible(true);
            field.setInt(a, b);
            field.setInt(b,temp);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取Unsafe实例
     * @return
     */
    public static Unsafe UnsafeUtil() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 一个二维数组和一个整数，判断数组中是否含有该整数
     * @param target
     * @param array
     * @return
     */
    public static boolean Find(int target, int [][] array) {

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) return true;
            }
        }
        return false;
    }

    public static int[] mergeSort(int[] arr, int left, int right){
        int mid = (left + right)/2;

        return null;
    }















}

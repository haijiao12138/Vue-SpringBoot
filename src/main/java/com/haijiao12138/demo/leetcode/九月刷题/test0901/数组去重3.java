package com.haijiao12138.demo.leetcode.九月刷题.test0901;

import org.springframework.data.relational.core.sql.In;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: haijiao12138
 * @ClassName: 数组去重3
 * @description: TODO
 * @date: 2021/9/1 21:18
 */
public class 数组去重3 {
    //方法4-通过lambda去重
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,6,4,5,7,1};
        int[] ints = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(ints));

    }
}

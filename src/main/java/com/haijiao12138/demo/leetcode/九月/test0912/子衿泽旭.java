package com.haijiao12138.demo.leetcode.九月.test0912;

import java.util.*;

/**
 * @author: haijiao12138
 * @ClassName: 子衿泽旭
 * @description: TODO
 * @date: 2021/9/13 20:46
 */
public class 子衿泽旭 {

    public static void main(String[] args) {
        int[] arr = {5,-3,300,3454,1234,45,56,657,3,4,5,6,7,8,9,90};
        int[] ints = test1(arr);
        int[] ints1 = test2(ints);
        int i = test3(ints1);
        System.out.println(i);
    }

    public static int[] test1(int[] arr) {
        if(arr.length<2){
            return arr;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(2 - arr[i])){
                return new int[]{map.get(2-arr[i]),i};
            }
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }

        }
        return new int[]{arr[0],arr[1]};
    }
    public static int[] test2(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        if (n > 5){
            for (int i = 0; i < 5; i++) {
                stack.push(arr[i]);//前五个入栈
            }
        }else {
            for (int i = 0; i < n; i++) {
                stack.push(arr[i]);
            }
        }
        int temp= 0;
        while (!stack.isEmpty() && temp!=1){
            Integer pop = stack.pop();
            temp++;
        }
        int size = stack.size();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = stack.pop();
        }
        return  a;

    }
    public static int test3(int[] arr){
        if(arr.length<1){
            return 0;
        }
        if(arr.length==1){
            return arr[0];
        }
        if (arr.length >= 51){
            return  arr[50];
        }

        for (int i = 2; i < 51 ; i*=2) {
            if(arr.length>=51/i){
                return arr[51/i-1];
            }
        }
        return 0;
    }




    public static int[] test111(int x){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=x ; i++) {
            if (x % i == 0){
                list.add(i);
            }
        }
        if (list.size()>9){
            int temp = 0;
            int[] arr = new int[9];
            List<Integer> list1 = new ArrayList<>();
            for (int i = list.size()-1,j=0; i >0 ; i--) {
                list1.add(list.get(i));
                temp++;
                if (temp == 9){
                    i = 0;
                }

            }
            for (int i = 0; i < list1.size(); i++) {
                arr[i] = list1.get(i);
            };
            return arr;
        }else {
            int[] arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }
    }


    public static int test222(int[] arr){
        if(arr.length<1){
            return 0;
        }
        if(arr.length==1){
            return arr[0];
        }
        for (int i = 0; i <= 42 ; i/=2) {
            if(arr.length>=i){
                return arr[i];
            }
        }
        return 0;
    }

    public static int test3(int num){
        return 26*num;
    }

}

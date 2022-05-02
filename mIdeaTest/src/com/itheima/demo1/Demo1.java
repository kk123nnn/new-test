package com.itheima.demo1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i + 1) + "个评委打分");
            int temp = sc.nextInt();
            if (temp >= 0 && temp <= 100) {
                arr[i] = temp;
            } else {
                System.out.println("输入不符合规范，请重新输入");
                i--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        System.out.println(index);
    }
}

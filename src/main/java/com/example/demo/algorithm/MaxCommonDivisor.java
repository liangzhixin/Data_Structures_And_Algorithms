package com.example.demo.algorithm;

/**
 * @ClassName com.example.demo.algorithm.MaxCommonDivisor
 * @Description 求两个数的最大公约数
 * @Author lzx
 * @Date 2019-12-25 10:56
 * @Version 1.0
 */
public class MaxCommonDivisor {

    public static void main(String[] args) {
//        MaxCommonDivisor test = new MaxCommonDivisor();
//        System.out.println(test.methodOne(60,24));
    }

    /**
     * 方法一：欧几里得算法
     */
    private int methodOne(int a, int b) {
        int m = a, n = b, r;
        while((r = m % n) != 0){
            m = n;
            n = r;
        }
        return n;
    }

    /**
     * 方法二：质因数分解法
     */
    private int methodTwo(int a, int b){

        return 0;
    }
}

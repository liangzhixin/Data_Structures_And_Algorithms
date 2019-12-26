package com.example.demo.algorithm;

import java.util.Arrays;

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
//        System.out.println(Arrays.toString(MaxCommonDivisor.factorization(72)));
        System.out.println(MaxCommonDivisor.methodTwo(48, 24));
    }

    /**
     * 方法一：欧几里得算法
     */
    private static int methodOne(int a, int b) {
        int m = a, n = b, r;
        while ((r = m % n) != 0) {
            m = n;
            n = r;
        }
        return n;
    }

    /**
     * 方法二：质因数分解法
     */
    private static int methodTwo(int a, int b) {
        int[] as = factorization(a);
        int[] bs = factorization(b);
        int[] sameArray = SameNumBetweenTwoOrderArray.method(as, bs);
        int res = 1;
        for (int i : sameArray) {
            res = res * i;
        }
        return res;
    }

    private static int[] factorization(int num) {
        int[] array = Factorization.methodOne(num);
        int[] res = new int[array.length];
        int count = 0;
        for (int i = 0; array[i] <= num; i++) {
            while ((num % array[i]) == 0) {
                res[count++] = array[i];
                if ((num = num / array[i]) == 1) {
                    break;
                }
            }
        }
        return Arrays.copyOf(res, count);
    }
}

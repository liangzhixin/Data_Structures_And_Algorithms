package com.example.demo.algorithm;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @ClassName com.example.demo.algorithm.Factorization
 * @Description 产生一个不大于给定整数n的连续质数序列
 * @Author lzx
 * @Date 2019-12-25 11:41
 * @Version 1.0
 */
@Slf4j
public class Factorization {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Factorization.methodOne(25)));
    }

    /**
     * 埃拉托色尼筛选法
     */
    public static int[] methodOne(int n) {
        int[] array = new int[n + 1];
        for (int i = 2; i < array.length; i++) {
            array[i] = 1;
        }
        int length = array.length - 2;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == 1 && j % i == 0) {
                    array[j] = 0;
                    length--;
                }
            }
        }
        int[] res = new int[length];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                res[num++] = i;
            }
        }
        return res;
    }
}

package com.example.demo.algorithm;

import java.util.Arrays;

/**
 * @ClassName com.example.demo.algorithm.SameNumBetweenTwoOrderArray
 * @Description 找出两个有序数组的相同元素
 * 数组int[] a = {2,3,3,5,7,11}
 * 数组int[] b = {3,5,5,7,9,17}
 * @Author lzx
 * @Date 2019-12-26 9:55
 * @Version 1.0
 */
public class SameNumBetweenTwoOrderArray {

    public static int[] method(int[] a, int[] b) {
        int[] res = new int[Math.min(a.length, b.length)];
        int count = 0, start = 0;
        for (int num : a) {
            for (int j = start; (j < b.length) && (num >= b[j]); j++) {
                if (num == b[j]) {
                    res[count++] = num;
                    start = j + 1;
                    break;
                }
            }
        }
        return Arrays.copyOf(res, count);
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 3, 5, 7, 11};
        int[] b = {3, 5, 5, 7, 9, 17};
        System.out.println(Arrays.toString(method(a, b)));
    }
}

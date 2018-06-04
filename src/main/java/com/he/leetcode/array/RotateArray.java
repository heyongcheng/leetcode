package com.he.leetcode.array;

import java.util.Arrays;

/**
 * @author heyc
 * @date 2018/6/2 7:43
 *
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        //                      7,1,2,3,4,5,6
        //                      6,7,1,2,3,4,5
        rotate3(array, 3);
        System.out.println(Arrays.toString(array));
    }

    /**
     * @param nums
     * @param k
     */
    public static void rotate1(int[] nums, int k) {
        k = k % nums.length;
        for (int i=1;i<=k;i++) {
            int tmp = nums[nums.length - 1];
            for (int j = nums.length -2; j>=0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = tmp;
        }
    }
    /**
     * rotate2
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        k = k % nums.length;
        if (k > 0) {
            int t = nums.length % k == 0 ? nums.length/k - 1 : nums.length/k;
            for (int i=1; i<=t; i++) {
                int start = nums.length - i * k;
                if (start >= k) {
                    int end = start + k;
                    for (int j=start; j<end; j++) {
                        int tmp = nums[j];
                        nums[j] =  nums[j -k];
                        nums[j -k] = tmp;
                    }
                } else {
                    int end = nums.length - (i - 1) * k;
                    for (int n=1;n<=k;n++) {
                        int tmp = nums[end - 1];
                        for (int j = end -2; j>=0; j--) {
                            nums[j + 1] = nums[j];
                        }
                        nums[0] = tmp;
                    }
                }
            }
        }
    }

    /**
     * rotate2
     * @param nums
     * @param k
     */
    public static void rotate3(int[] nums, int k) {
        k = k % nums.length;
        if (k > 0) {
            int pos = 0;
            int next = 0;
            int curr = nums[0];
            for (int t=0; t<nums.length; t++) {
                //目标位置
                pos = (pos + k) % nums.length;
                int tmp = nums[pos];
                nums[pos] = curr;
                // 循环 取下一个开始位置
                if (pos == next) {
                    next ++;
                    pos ++;
                    curr = nums[pos];
                } else {
                    curr = tmp;
                }
            }
        }
    }
}

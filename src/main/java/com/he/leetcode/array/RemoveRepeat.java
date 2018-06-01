package com.he.leetcode.array;

import java.util.Arrays;

/**
 * @author heyc
 * @date 2018/6/1 9:34
 *
 * 从排序数组中删除重复项
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveRepeat {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,2,3,4,5,5,6,7};
        sort(array);
    }

    public static void sort(int[] nums) {
        int len = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[len]) {
                nums[++len] = nums[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, len + 1)));
    }

}

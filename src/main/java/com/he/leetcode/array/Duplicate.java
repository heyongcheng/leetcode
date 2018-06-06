package com.he.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author heyc
 * @date 2018/6/5 9:26
 *
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false
 */
public class Duplicate {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,4,6,6};
        System.out.println(containsDuplicate2(array));
    }

    public static boolean containsDuplicate1(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i=0; i<nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}

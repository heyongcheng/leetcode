package com.he.leetcode.array;

/**
 * @author heyc
 * @date 2018/6/6 9:57
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class SingleNumber {

    public static void main(String[] args) {
        int number = singleNumber(new int[]{2,1,2,1,3});
        System.out.println(number);
    }

    /**
     * 一个整数和它本身异或之后得到值是0，0与其他整数异或得到的是这个整数本身
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i=0; i<nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

}

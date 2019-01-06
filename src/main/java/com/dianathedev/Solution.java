package com.dianathedev;

/**
 * Created by DianaGalvan on 1/5/19.
 */
public class Solution {
    public static int uniqueCount(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
            }
        }
        return i + 1;
    }
}

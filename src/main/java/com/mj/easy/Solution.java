package com.mj.easy;

import com.mogu.util.ArrayUtils;

public class Solution {

    /**
     * 删除排序数组中的重复项
     * @param nums 待删除重复项的数组
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int n = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[n]){
                n++;
                nums[n] = nums[i];
            }
        }
        ArrayUtils.printArray(nums);
        return n+1;
    }

}

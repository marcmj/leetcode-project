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
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                n++;
                int temp;
                for(int j=i+1;j<nums.length-1;j++){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        ArrayUtils.printArray(nums);
        return nums.length-n;
    }
}

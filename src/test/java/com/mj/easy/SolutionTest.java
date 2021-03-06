package com.mj.easy;

import com.mogu.util.ArrayUtils;
import com.mogu.util.RandomUtils;
import com.mogu.util.SortUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution test;
    private long startTime;
    private long endTime;

    @BeforeEach
    void setUp() {
        test = new Solution();
        startTime = System.currentTimeMillis();
    }

    @AfterEach
    void tearDown() {
        endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "ms");
    }

    @Test
    void removeDuplicates() {
        int[] nums = SortUtils.bubbleSort(RandomUtils.randomIntArray(10, 10));
        ArrayUtils.printArray(nums);
        int a = test.removeDuplicates(nums);
        System.out.println(a);
    }
}

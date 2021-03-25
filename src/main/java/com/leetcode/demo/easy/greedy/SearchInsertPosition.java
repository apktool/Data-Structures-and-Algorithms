package com.leetcode.demo.easy.greedy;

import java.util.Arrays;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */

public class SearchInsertPosition {
    public int solve01(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return index >= 0 ? index : Math.abs(index) - 1;
    }
}

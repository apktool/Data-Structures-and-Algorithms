package com.leetcode.demo.easy.greedy;

import java.util.Arrays;

/**
 * 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
 * 返回使 A 中的每个值都是唯一的最少操作次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinimumIncrementToMakeArrayUnique {
    public int solve01(int[] nums) {
        Arrays.sort(nums);
        int move = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                int pre = nums[i];
                nums[i] = nums[i - 1] + 1;
                move += nums[i] - pre;
            }
        }

        return move;
    }

    public int solve02(int[] nums) {
        int[] pos = new int[80000];
        Arrays.fill(pos, -1); // -1表示空位
        int move = 0;
        // 遍历每个数字a对其寻地址得到位置b, b比a的增量就是操作数。
        for (int a : nums) {
            int b = findPos(pos, a);
            move += b - a;
        }
        return move;
    }

    // 线性探测寻址（含路径压缩）
    private int findPos(int[] pos, int a) {
        int b = pos[a];
        // 如果a对应的位置pos[a]是空位，直接放入即可。
        if (b == -1) {
            pos[a] = a;
            return a;
        }
        // 否则向后寻址
        // 因为pos[a]中标记了上次寻址得到的空位，因此从pos[a]+1开始寻址就行了（不需要从a+1开始）。
        b = findPos(pos, b + 1);
        pos[a] = b; // 寻址后的新空位要重新赋值给pos[a]哦，路径压缩就是体现在这里。
        return b;
    }
}
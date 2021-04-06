package com.leetcode.demo.easy.array;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * <p>
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * <p>
 * 你可以返回任何满足上述条件的数组作为答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SortArrayByParityIi {
    public int[] solve01(int[] nums) {
        int i = 0, j = 1;

        while (i < nums.length && j < nums.length) {
            if (nums[i] % 2 != 0 && nums[j] % 2 != 1) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }

            if (nums[i] % 2 == 0) {
                i = i + 2;
            }

            if (nums[j] % 2 != 0) {
                j = j + 2;
            }
        }

        return nums;
    }

    public int[] solve02(int[] nums) {
        int[] res = new int[nums.length];

        int i = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[i] = num;
                i += 2;
            }
        }

        int j = 1;
        for (int num : nums) {
            if (num % 2 == 1) {
                res[j] = num;
                j += 2;
            }
        }

        return res;
    }
}

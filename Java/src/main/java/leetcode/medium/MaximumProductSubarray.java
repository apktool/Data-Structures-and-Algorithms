package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-23 23:03
 * *
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 *
 * Example 1:
 * Input: [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 */
public class MaximumProductSubarray {
    public int maxProduct1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] maxdp = new int[nums.length];
        int[] mindp = new int[nums.length];
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                maxVal = maxdp[i] = mindp[i] = nums[i];
            } else {
                maxdp[i] = Math.max(maxdp[i - 1] * nums[i], Math.max(mindp[i - 1] * nums[i], nums[i]));
                mindp[i] = Math.min(mindp[i - 1] * nums[i], Math.min(maxdp[i - 1] * nums[i], nums[i]));
                maxVal = Math.max(maxVal, maxdp[i]);
            }
        }

        return maxVal;
    }

    public int maxProduct2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxherepre = nums[0];
        int minherepre = nums[0];
        int maxsofar = nums[0];
        int maxhere, minhere;

        for (int i = 1; i < nums.length; i++) {
            maxhere = Math.max(Math.max(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
            minhere = Math.min(Math.min(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
            maxsofar = Math.max(maxhere, maxsofar);
            maxherepre = maxhere;
            minherepre = minhere;
        }
        return maxsofar;
    }

    public int maxProduct3(int[] nums) {
        int n = nums.length;
        int multi;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;

        multi = 1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, multi *= nums[i]);
            if (nums[i] == 0) {
                multi = 1;
            }
        }

        multi = 1;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, multi *= nums[i]);
            if (nums[i] == 0) {
                multi = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int result;

        MaximumProductSubarray haha = new MaximumProductSubarray();

        result = haha.maxProduct1(nums);
        System.out.println(result);

        result = haha.maxProduct2(nums);
        System.out.println(result);

        result = haha.maxProduct3(nums);
        System.out.println(result);
    }
}

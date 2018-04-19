package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-19 21:53
 * *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {
    public int maxSubArray1(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public int maxSubArray2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result;

        MaximumSubarray maximumSubarray = new MaximumSubarray();

        result = maximumSubarray.maxSubArray1(nums);
        System.out.println(result);

        result = maximumSubarray.maxSubArray2(nums);
        System.out.println(result);
    }
}

package com.leetcode.demo.easy.array;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PlusOne {
    public int[] solve01(int[] nums) {
        int carry = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = nums[i] + carry;
            if (nums[i] > 9) {
                carry = 1;
                nums[i] = 0;
            } else {
                carry = 0;
            }
        }

        if (carry == 1) {
            int[] tmp = new int[nums.length + 1];
            tmp[0] = carry;
            System.arraycopy(nums, 0, tmp, 1, nums.length);
            return tmp;
        }

        return nums;
    }
}

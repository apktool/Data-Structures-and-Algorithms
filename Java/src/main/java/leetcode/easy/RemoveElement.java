package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-18 20:52
 * *
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (val != nums[i]) {
                nums[j++] = nums[i];
            }
        }

        return j;
    }

    public void display(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int[] nums = {3, 2, 2, 3};
        int val = 2;
        int result;

        RemoveElement removeElement = new RemoveElement();
        result = removeElement.removeElement(nums, val);
        removeElement.display(nums, result);
    }
}

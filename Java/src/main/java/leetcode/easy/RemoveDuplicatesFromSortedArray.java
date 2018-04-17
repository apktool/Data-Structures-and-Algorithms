package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-17 20:30
 * *
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * It doesn't matter what values are set beyond the returned length.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }

        return ++j;
    }

    public void display(int[] nums) {
        for(int i = 0; i< nums.length; i++) {
            System.out.print(nums[i] );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result;

        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
        result = rd.removeDuplicates(nums);
        rd.display(nums);
    }
}

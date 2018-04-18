package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-18 21:33
 * *
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 */
public class SearchInsertPosition {
    public int searchInsert1(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0]) {
            return 0;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (target == nums[i]) {
                return i;
            }

            if (target > nums[i]) {
                return i + 1;
            }
        }

        return -1;
    }

    public int searchInsert2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int[] nums2 = {1, 3, 5, 6};
        int target = 0;
        int result;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        result = searchInsertPosition.searchInsert1(nums1, target);
        System.out.println(result);

        result = searchInsertPosition.searchInsert2(nums2, target);
        System.out.println(result);
    }
}

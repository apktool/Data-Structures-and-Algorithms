package leetcode.medium;

/**
 * @author apktool
 * @date 2018-07-06 20:20
 * *
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 * Example:
 *
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */
public class SortColors {
    /**
     * 【=========== red | ============== i | ============= blue 】
     * nums[0, red)是0, nums[red, i)是1，nums[i, blue]未知，nums(blue, end]是2
     */
    public void sortColors1(int[] nums) {
        int red = 0;
        int blue = nums.length - 1;
        for (int i = 0; i <= blue; i++) {
            //[red, i)都是1
            if (nums[i] == 0) {
                //所以换到i位置上的一定是1，不用让i--
                swap(nums, red, i);
                //如果让i后退，那么i和red有可能一直指向同一个index
                red++;
            } else if (nums[i] == 2) {
                swap(nums, i, blue);
                blue--;
                i--;
            }
        }
    }

    public void sortColors2(int[] nums) {
        int second = nums.length - 1, zero = 0;
        for (int i = 0; i <= second; i++) {
            while (nums[i] == 2 && i < second) {
                swap(nums, i, second--);
            }

            while (nums[i] == 0 && i > zero) {
                swap(nums, i, zero++);
            }
        }
    }

    public void sortColors3(int[] a) {
        int num0 = 0, num1 = 0, num2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                num0++;
            }
            if (a[i] == 1) {
                num1++;
            }
            if (a[i] == 2) {
                num2++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i < num0) {
                a[i] = 0;
            } else if (i < num0 + num1) {
                a[i] = 1;
            } else {
                a[i] = 2;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        SortColors sc = new SortColors();

        sc.sortColors1(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        System.out.println();

        sc.sortColors2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        System.out.println();

        sc.sortColors3(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}


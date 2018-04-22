package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-22 21:46
 */
public class MergeSortedArray {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums3 = new int[m];
        System.arraycopy(nums1, 0, nums3, 0, m);
        while (i < n && j < m) {
            if (nums2[i] < nums3[j]) {
                nums1[k++] = nums2[i++];
            } else if (nums2[i] > nums3[j]) {
                nums1[k++] = nums3[j++];
            } else {
                nums1[k++] = nums2[i++];
                nums1[k++] = nums3[j++];
            }
        }

        while (i < n) {
            nums1[k++] = nums2[i++];
        }

        while (j < m) {
            nums1[k++] = nums3[j++];
        }

        display(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        for (int k = m + n - 1; k >= 0; k--) {
            if (i < 0) {
                nums1[k] = nums2[j--];
                continue;
            }
            if (j < 0) {
                nums1[k] = nums1[i--];
                continue;
            }
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }
        }

        display(nums1);
    }

    public void display(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int m = 1;
        int n = 0;
        int[] nums1 = {1};
        int[] nums2 = {};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        mergeSortedArray.merge1(nums1, m, nums2, n);
        mergeSortedArray.merge2(nums1, m, nums2, n);
    }
}

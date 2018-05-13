package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-10 20:59
 * *
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 */
public class ContainerWithMostWater {
    // 在遇到超长数组时，出现超时
    public int maxArea1(int[] height) {
        if(height.length < 2) {
            return 0;
        }

        int max = 0;

        for (int i = 0; i< height.length; i++) {
            for(int j = i + 1; j< height.length; j++) {
                int temp = (j - i) * Math.min(height[i], height[j]);
                max = Math.max(temp, max);
            }
        }

        return max;
    }

    public int maxArea2(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;

        while (i < j) {
            int temp = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(temp, max);

            if(height[i] < height[j]) {
                i++;
            } else{
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {2, 1, 2};
        int result;

        ContainerWithMostWater haha = new ContainerWithMostWater();

        result = haha.maxArea1(height);
        System.out.println(result);

        result = haha.maxArea2(height);
        System.out.println(result);
    }
}

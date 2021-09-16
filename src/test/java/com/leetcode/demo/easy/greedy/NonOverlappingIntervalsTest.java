package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonOverlappingIntervalsTest {

    @Test
    public void solve01() {
        NonOverlappingIntervals demo = new NonOverlappingIntervals();

        int[][] nums1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int res1 = demo.solve01(nums1);
        int expect1 = 1;
        Assertions.assertEquals(expect1, res1);

        int[][] nums2 = {{1, 2}, {1, 2}, {1, 2}};
        int res2 = demo.solve01(nums2);
        int expect2 = 2;
        Assertions.assertEquals(expect2, res2);

        int[][] nums3 = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        int res3 = demo.solve01(nums3);
        int expect3 = 2;
        Assertions.assertEquals(expect3, res3);
    }

    @Test
    public void solve02() {
        NonOverlappingIntervals demo = new NonOverlappingIntervals();

        int[][] nums1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int res1 = demo.solve02(nums1);
        int expect1 = 1;
        Assertions.assertEquals(expect1, res1);

        int[][] nums2 = {{1, 2}, {1, 2}, {1, 2}};
        int res2 = demo.solve02(nums2);
        int expect2 = 2;
        Assertions.assertEquals(expect2, res2);

        int[][] nums3 = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        int res3 = demo.solve02(nums3);
        int expect3 = 2;
        Assertions.assertEquals(expect3, res3);

        int[][] nums4 = {{-52, 31}, {-73, -26}, {82, 97}, {-65, -11}, {-62, -49}, {95, 99}, {58, 95}, {-31, 49}, {66, 98}, {-63, 2}, {30, 47}, {-40, -26}};
        int res4 = demo.solve02(nums4);
        int expect4 = 7;
        Assertions.assertEquals(expect4, res4);
    }
}
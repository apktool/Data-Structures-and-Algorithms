package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupsOfSpecialEquivalentStringsTest {
    @Test
    public void solve01() {
        GroupsOfSpecialEquivalentStrings demo = new GroupsOfSpecialEquivalentStrings();

        String[] arr1 = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        int expect1 = 3;
        int res1 = demo.solve01(arr1);
        Assertions.assertEquals(expect1, res1);

        String[] arr2 = {"abc", "acb", "bac", "bca", "cab", "cba"};
        int expect2 = 3;
        int res2 = demo.solve01(arr2);
        Assertions.assertEquals(expect2, res2);

        String[] arr3 = {"a", "b", "c", "a", "c", "c"};
        int expect3 = 3;
        int res3 = demo.solve01(arr3);
        Assertions.assertEquals(expect3, res3);
    }

    @Test
    public void solve02() {
        GroupsOfSpecialEquivalentStrings demo = new GroupsOfSpecialEquivalentStrings();

        String[] arr1 = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        int expect1 = 3;
        int res1 = demo.solve02(arr1);
        Assertions.assertEquals(expect1, res1);

        String[] arr2 = {"abc", "acb", "bac", "bca", "cab", "cba"};
        int expect2 = 3;
        int res2 = demo.solve02(arr2);
        Assertions.assertEquals(expect2, res2);

        String[] arr3 = {"a", "b", "c", "a", "c", "c"};
        int expect3 = 3;
        int res3 = demo.solve02(arr3);
        Assertions.assertEquals(expect3, res3);
    }
}
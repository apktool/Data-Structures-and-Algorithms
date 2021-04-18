package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueMorseCodeWordsTest {

    @Test
    public void solve01() {
        UniqueMorseCodeWords demo = new UniqueMorseCodeWords();

        String[] arr1 = {"gin", "zen", "gig", "msg"};
        int expect1 = 2;
        int res1 = demo.solve01(arr1);
        Assertions.assertEquals(expect1, res1);
    }
}
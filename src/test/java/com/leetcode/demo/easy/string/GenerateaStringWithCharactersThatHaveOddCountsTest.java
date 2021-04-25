package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerateaStringWithCharactersThatHaveOddCountsTest {

    @Test
    public void solve01() {
        GenerateaStringWithCharactersThatHaveOddCounts demo = new GenerateaStringWithCharactersThatHaveOddCounts();

        int n1 = 4;
        String expect1 = "baaa";
        String res1 = demo.solve01(n1);
        Assertions.assertEquals(expect1, res1);

        int n2 = 7;
        String expect2 = "aaaaaaa";
        String res2 = demo.solve01(n2);
        Assertions.assertEquals(expect2, res2);
    }
}
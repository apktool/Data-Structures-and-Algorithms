package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecryptStringFromAlphabetToIntegerMappingTest {

    @Test
    public void solve01() {
        DecryptStringFromAlphabetToIntegerMapping demo = new DecryptStringFromAlphabetToIntegerMapping();

        String s1 = "10#11#12";
        String expect1 = "jkab";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);


        String s2 = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        String expect2 = "abcdefghijklmnopqrstuvwxyz";
        String res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }
}
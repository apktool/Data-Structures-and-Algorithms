package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {

    @Test
    public void solve01() {
        LengthOfLastWord demo = new LengthOfLastWord();

        String s1 = "Hello World";
        int expect1 = 5;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(res1, expect1);

        String s2 = " ";
        int expect2 = 0;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(res2, expect2);
    }

    @Test
    public void solve02() {
        LengthOfLastWord demo = new LengthOfLastWord();

        String s1 = "Hello World";
        int expect1 = 5;
        int res1 = demo.solve02(s1);
        Assertions.assertEquals(res1, expect1);

        String s2 = " ";
        int expect2 = 0;
        int res2 = demo.solve02(s2);
        Assertions.assertEquals(res2, expect2);
    }
}
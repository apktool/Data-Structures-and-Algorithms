package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RobotReturnToOriginTest {

    @Test
    public void solve01() {
        RobotReturnToOrigin demo = new RobotReturnToOrigin();

        String s1 = "UD";
        boolean res1 = demo.solve01(s1);
        Assertions.assertEquals(true, res1);

        String s2 = "LL";
        boolean res2 = demo.solve01(s2);
        Assertions.assertEquals(false, res2);
    }

    @Test
    public void solve02() {
        RobotReturnToOrigin demo = new RobotReturnToOrigin();

        String s1 = "UD";
        boolean res1 = demo.solve02(s1);
        Assertions.assertEquals(true, res1);

        String s2 = "LL";
        boolean res2 = demo.solve02(s2);
        Assertions.assertEquals(false, res2);
    }
}
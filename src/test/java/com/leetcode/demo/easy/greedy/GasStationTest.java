package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GasStationTest {

    @Test
    public void solve01() {
        GasStation demo = new GasStation();

        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        int res1 = demo.solve01(gas1, cost1);
        Assertions.assertEquals(3, res1);
    }
}
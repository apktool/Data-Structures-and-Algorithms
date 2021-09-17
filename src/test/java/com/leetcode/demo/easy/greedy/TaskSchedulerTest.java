package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskSchedulerTest {

    @Test
    public void solve01() {
        TaskScheduler demo = new TaskScheduler();

        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n1 = 2;
        int res1 = demo.solve01(tasks1, n1);
        int expect1 = 8;
        Assertions.assertEquals(expect1, res1);

        char[] tasks2 = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int n2 = 2;
        int res2 = demo.solve01(tasks2, n2);
        int expect2 = 16;
        Assertions.assertEquals(expect2, res2);
    }
}
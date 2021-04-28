package com.leetcode.demo.easy.string;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DestinationCityTest {

    @Test
    public void solve01() {
        DestinationCity demo = new DestinationCity();

        List<String> path1 = Arrays.asList("London", "New York");
        List<String> path2 = Arrays.asList("New York", "Lima");
        List<String> path3 = Arrays.asList("Lima", "Sao Paulo");
        List<List<String>> paths = Arrays.asList(path1, path2, path3);

        String expect = "Sao Paulo";
        String res = demo.solve01(paths);
        Assertions.assertEquals(expect, res);
    }

    @Test
    public void solve02() {
        DestinationCity demo = new DestinationCity();

        List<String> path1 = Arrays.asList("B", "C");
        List<String> path2 = Arrays.asList("D", "B");
        List<String> path3 = Arrays.asList("C", "A");
        List<List<String>> paths = Arrays.asList(path1, path2, path3);

        String expect = "A";
        String res = demo.solve02(paths);
        Assertions.assertEquals(expect, res);
    }
}
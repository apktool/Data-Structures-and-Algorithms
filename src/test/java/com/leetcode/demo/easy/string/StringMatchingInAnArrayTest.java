package com.leetcode.demo.easy.string;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringMatchingInAnArrayTest {

    @Test
    public void solve01() {
        StringMatchingInAnArray demo = new StringMatchingInAnArray();

        String[] str1 = {"mass", "as", "hero", "superhero"};
        List<String> expect1 = Arrays.asList(new String[]{"as", "hero"});
        List<String> res1 = demo.solve01(str1);
        Assertions.assertLinesMatch(expect1, res1);

        String[] str2 = {"blue", "green", "bu"};
        List<String> expect2 = Arrays.asList(new String[]{});
        List<String> res2 = demo.solve01(str2);
        Assertions.assertLinesMatch(expect2, res2);
    }

    @Test
    public void solve02() {
        StringMatchingInAnArray demo = new StringMatchingInAnArray();

        String[] str1 = {"mass", "as", "hero", "superhero"};
        List<String> expect1 = Arrays.asList(new String[]{"as", "hero"});
        List<String> res1 = demo.solve02(str1);
        Assertions.assertLinesMatch(expect1, res1);

        String[] str2 = {"blue", "green", "bu"};
        List<String> expect2 = Arrays.asList(new String[]{});
        List<String> res2 = demo.solve02(str2);
        Assertions.assertLinesMatch(expect2, res2);
    }
}
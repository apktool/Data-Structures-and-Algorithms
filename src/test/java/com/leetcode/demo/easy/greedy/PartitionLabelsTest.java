package com.leetcode.demo.easy.greedy;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PartitionLabelsTest {

    @Test
    public void solve01() {
        PartitionLabels demo = new PartitionLabels();

        String s1 = "ababcbacadefegdehijhklij";
        List<Integer> expect1 = List.of(9, 7, 8);
        List<Integer> res1 = demo.solve01(s1);
        Assertions.assertIterableEquals(expect1, res1);
    }
}
package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentAttendanceRecordITest {

    @Test
    public void solve01() {
        StudentAttendanceRecordI demo = new StudentAttendanceRecordI();

        String s1 = "PPALLP";
        boolean res1 = demo.solve01(s1);
        Assertions.assertEquals(true, res1);

        String s2 = "PPALLL";
        boolean res2 = demo.solve01(s2);
        Assertions.assertEquals(false, res2);
    }

    @Test
    public void solve02() {
        StudentAttendanceRecordI demo = new StudentAttendanceRecordI();

        String s1 = "PPALLP";
        boolean res1 = demo.solve02(s1);
        Assertions.assertEquals(true, res1);

        String s2 = "PPALLL";
        boolean res2 = demo.solve02(s2);
        Assertions.assertEquals(false, res2);
    }
}
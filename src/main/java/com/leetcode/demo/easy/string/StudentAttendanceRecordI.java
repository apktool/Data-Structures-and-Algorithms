package com.leetcode.demo.easy.string;

/**
 * 给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
 * <p>
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 * 如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 * <p>
 * 你需要根据这个学生的出勤记录判断他是否会被奖赏。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/student-attendance-record-i
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class StudentAttendanceRecordI {
    public boolean solve01(String s) {
        int cntA = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++, sum++) {
            if (s.charAt(i) == 'A') {
                cntA++;
            }
        }

        return cntA < 2 && s.indexOf("LLL") < 0;
    }

    public boolean solve02(String s) {
        for (int i = 0, cntA = 0, cntL = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                cntL = 0;
                cntA++;
                if (cntA > 1) {
                    return false;
                }
            } else if (s.charAt(i) == 'L') {
                cntL++;
                if (cntL > 2) {
                    return false;
                }
            } else {
                cntL = 0;
            }
        }

        return true;
    }
}

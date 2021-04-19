package com.leetcode.demo.easy.string;

/**
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
 * <p>
 * 交换字母的定义是取两个下标 i 和 j （下标从 0 开始），只要 i!=j 就交换 A[i] 和 A[j] 处的字符。例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/buddy-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BuddyStrings {
    /**
     * 首先我们知道两个字符串要么是亲密字符串，要么不是亲密字符串
     * 对于亲密字符串来说，有两种情况
     * a). 一种是两个字符串完全相同，此时如果字符串中有两个相同的字母，那么进行交换以后字符串不变，成为亲密字符串的条件成立.
     * b). 一种是两个字符串不同，此时字符串应该存在两处不同(一处或者三处都无法成为亲密字符串)，进行一次交换便可以变成另一个字符串
     * 对于非亲密字符串来说，有三种情况
     * a). 一种是两个字符串长度不同，那么一定不是亲密字符串.
     * b). 一种是两个字符串有一种或者二种以上的不同的地方(或者两种地方不同但是不满足A[i] == B[j] && B[i] == A[j]).
     * c). 一种是两个字符串完全相同，但是没有一个字符出现两次以上
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean solve01(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.equals(s2)) {
            int[] count = new int[26];
            for (int i = 0; i < s1.length(); ++i) {
                count[s2.charAt(i) - 'a']++;
            }

            for (int c : count) {
                if (c > 1) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < s1.length(); ++i) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }

            return second != -1 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);
        }
    }
}
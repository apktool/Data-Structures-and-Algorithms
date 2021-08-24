package com.leetcode.demo.easy.backtrack;

/**
 * 累加数是一个字符串，组成它的数字可以形成累加序列。
 * 一个有效的累加序列必须至少包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。
 * 给定一个只包含数字'0'-'9'的字符串，编写一个算法来判断给定输入是否是累加数。
 * 说明:累加序列里的数不会以 0 开头，所以不会出现1, 2, 03 或者1, 02, 3的情况。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/additive-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AdditiveNumber {
    public boolean solve01(String num) {
        return backtrack(num, 0, 0, 0, 0);
    }

    private boolean backtrack(String num, int idx, long sum, long pre, int k) {
        if (idx == num.length()) {
            return k > 2;
        }

        for (int i = idx; i < num.length(); i++) {
            long cur = fetch(num, idx, i);

            // 剪枝：无效数字
            if (cur == -1) {
                return false;
            }

            // 剪枝：当前数字不等于前面两数之和
            if (k >= 2 && cur != sum) {
                continue;
            }

            if (backtrack(num, i + 1, pre + cur, cur, k + 1)) {
                return true;
            }
        }
        return false;
    }

    private long fetch(String num, int l, int r) {
        if (l < r && num.charAt(l) == '0') {
            return -1;
        }
        long res = 0;
        while (l <= r) {
            res = res * 10 + num.charAt(l++) - '0';
        }
        return res;
    }
}

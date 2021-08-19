package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个只包含数字的字符串，用以表示一个 IP 地址，返回所有可能从 s 获得的 有效 IP 地址 。你可以按任何顺序返回答案。
 * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
 * 例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效 IP 地址。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/restore-ip-addresses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class RestoreIpAddresses {
    public List<String> solve01(String s) {
        List<String> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), s, 0, 4);
        return list;
    }

    private void backtrack(List<String> list, List<String> res, String s, int begin, int residue) {
        if (begin == s.length()) {
            if (residue == 0) {
                list.add(String.join(".", res));
            }
        }

        for (int i = begin; i < begin + 3; i++) {
            if (i >= s.length()) {
                break;
            }

            if (residue * 3 < s.length() - i) {
                continue;
            }

            if (check(s, begin, i)) {
                res.add(s.substring(begin, i + 1));
                backtrack(list, res, s, i + 1, residue - 1);
                res.remove(res.size() - 1);
            }
        }
    }

    private boolean check(String s, int left, int right) {
        int len = right - left + 1;
        if (len > 1 && s.charAt(left) == '0') {
            return false;
        }

        int res = 0;
        while (left <= right) {
            res = res * 10 + s.charAt(left) - '0';
            left++;
        }

        return res >= 0 && res <= 255;
    }
}

package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-case-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LetterCasePermutation {
    public List<String> solve01(String s) {
        List<String> res = new ArrayList<>();
        backtrace(res, s.toCharArray(), 0);
        return res;
    }

    private void backtrace(List<String> res, char[] arr, int idx) {
        res.add(new String(arr));

        for (int i = idx; i < arr.length; i++) {
            if (!Character.isDigit(arr[i])) {
                char tmp = arr[i];
                arr[i] ^= (1 << 5);
                backtrace(res, arr, i + 1);
                arr[i] = tmp;
            }
        }
    }
}

package com.leetcode.demo.easy.string;

import java.util.Arrays;

/**
 * 给你一个日志数组 logs。每条日志都是以空格分隔的字串，其第一个字为字母与数字混合的 标识符 。
 * 有两种不同类型的日志：
 * <p>
 * 字母日志：除标识符之外，所有字均由小写字母组成
 * 数字日志：除标识符之外，所有字均由数字组成
 * 请按下述规则将日志重新排序：
 * <p>
 * 所有 字母日志 都排在 数字日志 之前。
 * 字母日志 在内容不同时，忽略标识符后，按内容字母顺序排序；在内容相同时，按标识符排序。
 * 数字日志 应该保留原来的相对顺序。
 * 返回日志的最终顺序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorder-data-in-log-files
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReorderDataInLogFiles {
    public String[] solve01(String[] str) {
        Arrays.sort(str, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));

            String[] split2 = log2.split(" ", 2);
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                return cmp != 0 ? cmp : split1[0].compareTo(split2[0]);
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        return str;
    }
}

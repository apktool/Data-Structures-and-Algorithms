package com.leetcode.demo.easy.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 你将得到一个字符串数组 A。
 * 每次移动都可以交换 S 的任意两个偶数下标的字符或任意两个奇数下标的字符。
 * 如果经过任意次数的移动，S == T，那么两个字符串 S 和 T 是 特殊等价 的。
 * <p>
 * 例如，S = "zzxy" 和 T = "xyzz" 是一对特殊等价字符串，因为可以先交换 S[0] 和 S[2]，然后交换 S[1] 和 S[3]，使得 "zzxy" -> "xzzy" -> "xyzz" 。
 * 现在规定，A 的 一组特殊等价字符串 就是 A 的一个同时满足下述条件的非空子集：
 * <p>
 * 该组中的每一对字符串都是 特殊等价 的
 * 该组字符串已经涵盖了该类别中的所有特殊等价字符串，容量达到理论上的最大值（也就是说，如果一个字符串不在该组中，那么这个字符串就 不会 与该组内任何字符串特殊等价）
 * 返回 A 中特殊等价字符串组的数量。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/groups-of-special-equivalent-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class GroupsOfSpecialEquivalentStrings {
    public int solve01(String[] arr) {
        Set<String> sets = new HashSet<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            StringBuilder builder = new StringBuilder();
            char[] ints = new char[arr[i].length() / 2 + 1];

            for (int j = 0, idx = 0; j < arr[i].length(); j = j + 2) {
                ints[idx++] = arr[i].charAt(j);
            }

            Arrays.sort(ints);
            builder.append(new String(ints));

            ints = new char[arr[i].length() / 2 + 1];

            for (int j = 1, idx = 0; j < arr[i].length(); j = j + 2) {
                ints[idx++] = arr[i].charAt(j);
            }

            Arrays.sort(ints);
            builder.append(new String(ints));

            sets.add(builder.toString());
        }

        return sets.size();
    }

    /**
     * 这些排列的特征在于字母的数量：所有这样的排列都有相同的数量，不同的数量会产生不同的排列。
     * 因此，函数 C(S)=（S 中偶数索引字母的数量，其后是 S 中奇数索引字母的数量）成功地刻画了这一等价关系。
     * <p>
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/groups-of-special-equivalent-strings/solution/te-shu-deng-jie-zi-fu-chuan-zu-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param arr
     * @return
     */
    public int solve02(String[] arr) {
        Set<String> sets = new HashSet<>(arr.length);

        for (String s : arr) {
            int[] count = new int[26 * 2];
            for (int i = 0; i < s.length(); ++i) {
                // 原来的偶数位存储在0-25，原来的奇数位存储在25-51
                count[s.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            sets.add(Arrays.toString(count));
        }

        return sets.size();
    }
}

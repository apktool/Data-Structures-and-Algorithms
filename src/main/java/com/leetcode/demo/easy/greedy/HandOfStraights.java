package com.leetcode.demo.easy.greedy;

import java.util.TreeMap;

/**
 * 爱丽丝有一手（hand）由整数数组给定的牌。
 * 现在她想把牌重新排列成组，使得每个组的大小都是 w，且由 w 张连续的牌组成。
 * 如果她可以完成分组就返回 true，否则返回 false。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/hand-of-straights
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class HandOfStraights {
    public boolean solve01(int[] hand, int groupSize) {
        if (hand == null || hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int item : hand) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        while (!map.isEmpty()) {
            int first = map.firstKey();
            for (int num = first; num < first + groupSize; num++) {
                if (!map.containsKey(num)) {
                    return false;
                }

                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) {
                    map.remove(num);
                }
            }
        }

        return true;
    }
}

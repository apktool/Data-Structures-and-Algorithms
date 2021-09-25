package com.leetcode.demo.easy.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * 森林中，每个兔子都有颜色。其中一些兔子（可能是全部）告诉你还有多少其他的兔子和自己有相同的颜色。我们将这些回答放在answers数组里。
 * 返回森林中兔子的最少数量。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rabbits-in-forest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RabbitsInForest {
    public int solve01(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : answers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int y = entry.getKey(), x = entry.getValue();
            ans += (x + y) / (y + 1) * (y + 1);
        }

        return ans;
    }

    public int solve02(int[] answers) {
        int[] rab = new int[1000];
        int res = 0;
        for (int i : answers) {
            if (rab[i] == 0) {
                res += i + 1;
                rab[i] = i;
            } else {
                rab[i]--;
            }
        }
        return res;
    }
}

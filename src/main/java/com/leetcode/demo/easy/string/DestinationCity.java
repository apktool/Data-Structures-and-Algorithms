package com.leetcode.demo.easy.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi 。
 * 请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
 * <p>
 * 题目数据保证线路图会形成一条不存在循环的线路，因此只会有一个旅行终点站。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/destination-city
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DestinationCity {
    public String solve01(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        paths.forEach(t -> map.put(t.get(0), t.get(1)));
        return map.values().stream().filter(t -> !map.containsKey(t)).findAny().get();
    }

    public String solve02(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> list : paths) {
            map.put(list.get(0), list.get(1));
        }

        for (String s : map.values()) {
            if (!map.containsKey(s))
                return s;
        }
        return "";
    }
}

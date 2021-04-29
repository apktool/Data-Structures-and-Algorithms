package com.leetcode.demo.easy.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个字符串 path，其中 path[i] 的值可以是 'N'、'S'、'E' 或者 'W'，分别表示向北、向南、向东、向西移动一个单位。
 * 机器人从二维平面上的原点 (0, 0) 处开始出发，按 path 所指示的路径行走。
 * 如果路径在任何位置上出现相交的情况，也就是走到之前已经走过的位置，请返回 True ；否则，返回 False 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-crossing
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PathCrossing {
    public boolean solve01(String path) {
        Set<Integer> vis = new HashSet<>();

        int x = 0, y = 0;
        vis.add(getHash(x, y));

        int length = path.length();
        for (int i = 0; i < length; i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                default:
                    break;
            }
            int hashValue = getHash(x, y);
            if (!vis.add(hashValue)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 哈希函数 f(x,y)=x×20001+y，这是因为 y 的取值范围在 [-10^4, 10^4]内，共有 20001 种可能性，上述的哈希函数就不会造成冲突。
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/path-crossing/solution/pan-duan-lu-jing-shi-fou-xiang-jiao-by-leetcode-so/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param x
     * @param y
     * @return
     */
    private int getHash(int x, int y) {
        return x * 20001 + y;
    }
}

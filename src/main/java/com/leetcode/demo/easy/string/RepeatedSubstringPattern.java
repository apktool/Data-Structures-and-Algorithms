package com.leetcode.demo.easy.string;

/**
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RepeatedSubstringPattern {
    public boolean solve01(String s) {
        return s.concat(s).indexOf(s, 1) != s.length();
    }

    /**
     * KMP
     *
     * @param s
     * @return
     */
    public boolean solve02(String s) {
        int[] next = next(s);
        /*
         * 最长相等前后缀的长度为：next[len-1]+1
         * 数组长度: len
         * 如果len%(len-(next[len-1]+1))==0,说明数组的长度整除，说明该字符串有重复的子字符串
         */
        int len = next.length;
        int last = next[len - 1];
        return last != -1 && len % (len - (last + 1)) == 0;
    }

    private int[] next(String s) {
        char[] str = s.toCharArray();
        int[] next = new int[str.length];
        next[0] = -1;

        int i = 1, k = -1;
        while (i < str.length) {
            if (k != -1) {
                if (str[i] == str[k + 1]) {
                    next[i] = k + 1;
                    i++;
                    k++;
                } else {
                    k = next[k];
                }
            } else {
                k = next[i] = str[0] == str[i] ? 0 : -1;
                i++;
            }
        }

        return next;
    }
}

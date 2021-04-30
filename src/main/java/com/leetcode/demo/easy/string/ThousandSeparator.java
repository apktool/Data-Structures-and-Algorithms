package com.leetcode.demo.easy.string;

public class ThousandSeparator {
    public String solve01(int n) {
        int count = 0;
        StringBuffer ans = new StringBuffer();
        do {
            int cur = n % 10;
            ans.append(cur);
            n /= 10;
            if (++count % 3 == 0 && n != 0) {
                ans.append('.');
            }
        } while (n != 0);
        return ans.reverse().toString();
    }
}

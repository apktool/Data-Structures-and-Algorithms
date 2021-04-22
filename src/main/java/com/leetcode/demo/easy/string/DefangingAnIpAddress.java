package com.leetcode.demo.easy.string;

/**
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/defanging-an-ip-address
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DefangingAnIpAddress {
    public String solve01(String s) {
        return s.replace(".", "[.]");
    }

    public String solve02(String s) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                builder.append("[").append(s.charAt(i)).append("]");
            } else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }
}

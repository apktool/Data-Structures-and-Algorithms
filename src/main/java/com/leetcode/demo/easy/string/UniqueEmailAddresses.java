package com.leetcode.demo.easy.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 每封电子邮件都由一个本地名称和一个域名组成，以 @ 符号分隔。
 * <p>
 * 例如，在alice@leetcode.com中，alice是本地名称，而leetcode.com是域名。
 * 除了小写字母，这些电子邮件还可能包含 '.' 或 '+'。
 * 如果在电子邮件地址的本地名称部分中的某些字符之间添加句点（'.'），则发往那里的邮件将会转发到本地名称中没有点的同一地址。
 * 例如，"alice.z@leetcode.com” 和 “alicez@leetcode.com”会转发到同一电子邮件地址。 （请注意，此规则不适用于域名。）
 * 如果在本地名称中添加加号（'+'），则会忽略第一个加号后面的所有内容。
 * 这允许过滤某些电子邮件，例如 m.y+name@email.com 将转发到 my@email.com。（同样，此规则不适用于域名。）
 * 可以同时使用这两个规则。
 * <p>
 * 给定电子邮件列表 emails，我们会向列表中的每个地址发送一封电子邮件。实际收到邮件的不同地址有多少？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-email-addresses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class UniqueEmailAddresses {
    public int solve01(String[] str) {
        Set<String> sets = new HashSet<>();

        for (int i = 0; i < str.length; i++) {
            StringBuilder builder = new StringBuilder();
            boolean flag = true;

            for (int j = 0; j < str[i].length(); j++) {
                if (flag) {
                    if ('.' == str[i].charAt(j)) {
                        continue;
                    }

                    if ('+' == str[i].charAt(j)) {
                        while ('@' != str[i].charAt(j)) {
                            j++;
                        }
                    }

                    if ('@' == str[i].charAt(j)) {
                        flag = false;
                    }
                }

                builder.append(str[i].charAt(j));
            }

            sets.add(builder.toString());
        }

        return sets.size();
    }

    public int solve02(String[] str) {
        Set<String> sets = new HashSet();
        for (String email : str) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);

            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            // Note: one should escape the specific character '.',
            // since it is treated as a regex expression.
            local = local.replaceAll("\\.", "");
            sets.add(local + rest);
        }

        return sets.size();
    }
}

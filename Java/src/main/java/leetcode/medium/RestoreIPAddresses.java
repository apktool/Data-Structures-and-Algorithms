package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apktool
 * @date 2018-06-13 21:52
 * *
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 *
 * Example:
 *
 * Input: "25525511135"
 * Output: ["255.255.11.135", "255.255.111.35"]
 */

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList();

        if (s.length() > 12) {
            return list;
        }

        restoreIpAddressesHelper(s, list, 0, "", 0);
        return list;
    }

    private void restoreIpAddressesHelper(String s, List<String> list, int pos, String res, int sec) {
        if (sec == 4 && pos == s.length()) {
            list.add(res);
            return;
        }

        for (int i = 1; i < 4; i++) {
            if (pos + i > s.length()) {
                break;
            }

            String section = s.substring(pos, pos + i);

            if (section.length() > 1 && section.startsWith("0") || Integer.parseInt(section) >= 256) {
                break;
            }

            restoreIpAddressesHelper(s, list, pos + i, sec == 0 ? section : res + "." + section, sec + 1);
        }
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result;

        RestoreIPAddresses haha = new RestoreIPAddresses();
        result = haha.restoreIpAddresses(s);
        System.out.println(result);

    }
}

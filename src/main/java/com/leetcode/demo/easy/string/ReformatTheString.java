package com.leetcode.demo.easy.string;

/**
 * 给你一个混合了数字和字母的字符串 s，其中的字母均为小写英文字母。
 * 请你将该字符串重新格式化，使得任意两个相邻字符的类型都不同。也就是说，字母后面应该跟着数字，而数字后面应该跟着字母。
 * 请你返回 重新格式化后 的字符串；如果无法按要求重新格式化，则返回一个 空字符串 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reformat-the-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReformatTheString {
    public String solve01(String s) {
        char[] chars = new char[s.length()];
        int i = 0;

        char[] nums = new char[s.length()];
        int j = 0;

        for (char item : s.toCharArray()) {
            if (item >= 'a' && item <= 'z') {
                chars[i++] = item;
            } else {
                nums[j++] = item;
            }
        }

        if (i == j) {
            StringBuilder builder = new StringBuilder();
            while (i > 0 && j > 0) {
                builder.append(chars[--i]).append(nums[--j]);
            }

            return builder.toString();
        } else if (i - j == 1) {
            StringBuilder builder = new StringBuilder();
            while (i > 0 && j > 0) {
                builder.append(chars[--i]).append(nums[--j]);
            }

            builder.append(chars[--i]);
            return builder.toString();
        } else if (j - i == 1) {
            StringBuilder builder = new StringBuilder();
            while (i > 0 && j > 0) {
                builder.append(nums[--j]).append(chars[--i]);
            }

            builder.append(nums[--j]);
            return builder.toString();
        }

        return "";
    }

    public String solve02(String s) {
        int nums = 0;
        int chars = 0;

        for (char item : s.toCharArray()) {
            if (item >= 'a' && item <= 'z') {
                ++chars;
            } else {
                ++nums;
            }
        }

        if (Math.abs(chars - nums) > 1) {
            return "";
        }

        if (chars > nums) {
            chars = 0;
            nums = 1;
        } else {
            chars = 1;
            nums = 0;
        }

        char[] res = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp >= 'a' && tmp <= 'z') {
                res[chars] = tmp;
                chars += 2;
            } else {
                res[nums] = tmp;
                nums += 2;
            }
        }

        return new String(res);
    }
}
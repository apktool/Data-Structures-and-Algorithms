package com.leetcode.demo.easy.string;

/**
 * 给你一个字符串date，它的格式为Day Month Year，其中：
 * <p>
 * Day是集合{"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}中的一个元素。
 * Month是集合{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}中的一个元素。
 * Year的范围在 [1900, 2100]之间。
 * 请你将字符串转变为YYYY-MM-DD的格式，其中：
 * <p>
 * YYYY表示 4 位的年份。
 * MM表示 2 位的月份。
 * DD表示 2 位的天数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reformat-date
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReformatDate {
    public String solve01(String date) {
        int dateLen = date.length();
        StringBuilder sb = new StringBuilder(10);
        sb.append(date.substring(dateLen - 4));
        sb.append("-");
        String month = date.substring(dateLen - 8, dateLen - 5);
        switch (month) {
            case "Jan":
                sb.append("01-");
                break;
            case "Feb":
                sb.append("02-");
                break;
            case "Mar":
                sb.append("03-");
                break;
            case "Apr":
                sb.append("04-");
                break;
            case "May":
                sb.append("05-");
                break;
            case "Jun":
                sb.append("06-");
                break;
            case "Jul":
                sb.append("07-");
                break;
            case "Aug":
                sb.append("08-");
                break;
            case "Sep":
                sb.append("09-");
                break;
            case "Oct":
                sb.append("10-");
                break;
            case "Nov":
                sb.append("11-");
                break;
            case "Dec":
                sb.append("12-");
                break;
        }
        String day = date.substring(0, dateLen - 11);
        if (day.length() == 1) {
            sb.append("0");
        }
        sb.append(day);
        return sb.toString();
    }
}

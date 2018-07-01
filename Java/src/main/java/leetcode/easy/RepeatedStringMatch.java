package leetcode.easy;

/**
 * @author apktool
 * @date 2018-07-01 21:05
 * *
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it.
 * If no such solution, return -1.
 *
 * For example, with A = "abcd" and B = "cdabcdab".
 * Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it;
 * and B is not a substring of A repeated two times ("abcdabcd").
 * *
 * https://leetcode.com/problems/repeated-string-match/discuss/108118/C++Java-Clean-Code
 */
public class RepeatedStringMatch {
    // 各种情况考虑不周，因此部分会出错
    public int repeatedStringMatch1(String A, String B) {
        if (A.length() > B.length()) {
            if (A.contains(B)) {
                return 1;
            } else if ((A + A).contains(B)) {
                return 2;
            } else {
                return -1;
            }
        }

        String temp = "";
        int count = 0;
        while (temp.length() <= B.length()) {
            if (!temp.contains(B)) {
                count++;
            }
            temp = temp + A;
        }
        return count;
    }

    /**
     * first of all, we need as to be at least as long as b:
     * a: "abc" "abc"
     * b: "abc abc" - in this case we need 2 copies of a;
     *
     * a:"abc" "abc" "abc"
     * b: "c abc ab" - in this case we need 3 copies of a
     *
     * We can tell we need at least 1 extra copy, b.length() / a.length() + 1 works fine when a.len / a.len == 0
     * But:
     * a: "abc" "abc" "abc"
     * b: "c abc a" - in this case we still need 3 copies of a, but a.len / b.len (5/3) only give you 1
     * That's why we want to add at least 2 copies.
     */
    public int repeatedStringMatch2(String A, String B) {
        String as = A;
        for (int rep = 1; rep <= B.length() / A.length() + 2; rep++, as += A) {
            if (as.contains(B)) {
                return rep;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RepeatedStringMatch haha = new RepeatedStringMatch();
        String A = "aa";
        String B = "a";
        int result;

        result = haha.repeatedStringMatch1(A, B);
        System.out.println(result);

        result = haha.repeatedStringMatch2(A, B);
        System.out.println(result);
    }
}

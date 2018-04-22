package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-22 21:26
 * *
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * *
 * Basically it's a fibonacci.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }

        int[] answer = new int[n + 1];

        answer[1] = 1;
        answer[2] = 2;

        for (int i = 3; i <= n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int result = 0;

        ClimbingStairs climbingStairs = new ClimbingStairs();
        result = climbingStairs.climbStairs(n);
        System.out.println(result);
    }
}

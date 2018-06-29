package geeksforgeeks.medium;

/**
 * @author apktool
 * @date 2018-06-29 14:59
 * *
 * Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
 * <p>
 * Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
 * Output:  True  //There is a subset (4, 5) with sum 9.
 * *
 * https://www.geeksforgeeks.org/dynamic-programming-subset-sum-problem/
 */
public class SubsetSum {
    boolean isSubsetSumRecursive(int set[], int n, int sum) {
        // Base Cases
        if (sum == 0) {
            return true;
        }
        if (n == 0 && sum != 0) {
            return false;
        }

        // If last element is greater than sum, then ignore it
        if (set[n - 1] > sum) {
            return isSubsetSumRecursive(set, n - 1, sum);
        }

        /**
         *  else, check if sum can be obtained by any of the following
         *  (a) including the last element
         *  (b) excluding the last element
         */
        return isSubsetSumRecursive(set, n - 1, sum) || isSubsetSumRecursive(set, n - 1, sum - set[n - 1]);
    }

    boolean isSubsetSumNoRecursive(int set[], int n, int sum) {
        // The value of subset[i][j] will be true if there is a subset of set[0..j-1] with sum equal to i
        boolean subset[][] = new boolean[n + 1][sum + 1];

        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++) {
            subset[i][0] = true;
        }

        // If sum is not 0 and set is empty, then answer is false
        for (int j = 1; j <= sum; j++) {
            subset[0][j] = false;
        }

        // Fill the subset table in botton up manner
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                subset[i][j] = subset[i - 1][j];
                if (j >= set[i - 1]) {
                    subset[i][j] = subset[i][j] || subset[i - 1][j - set[i - 1]];
                }
            }
        }

        // uncomment this code to print table
        /*
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print(subset[i][j] + "\t");
            }
            System.out.println();
        }
        */

        return subset[n][sum];
    }

    public static void main(String args[]) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        boolean result;

        SubsetSum ssm = new SubsetSum();

        result = ssm.isSubsetSumRecursive(set, set.length, sum);
        if (result == true) {
            System.out.println("Found a subset with given sum");
        } else {
            System.out.println("No subset with given sum");
        }

        result = ssm.isSubsetSumNoRecursive(set, set.length, sum);
        if (result == true) {
            System.out.println("Found a subset with given sum");
        } else {
            System.out.println("No subset with given sum");
        }
    }
}

class Solution {
    public int climbStairs(int n) {
        return helper(n, new int[n + 1]);
    }

    private int helper(int n, int[] memo) {
        if (n <= 1) return 1;
        if (memo[n] != 0) return memo[n];
        return memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
    }
}
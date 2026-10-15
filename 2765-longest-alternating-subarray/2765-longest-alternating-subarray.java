class Solution {
    public int alternatingSubarray(int[] nums) {
        int n = nums.length;
        int ans = -1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int expected = ((j - i) % 2 == 1) ? 1 : -1;
                if (nums[j] - nums[j - 1] != expected) break;
                ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
}
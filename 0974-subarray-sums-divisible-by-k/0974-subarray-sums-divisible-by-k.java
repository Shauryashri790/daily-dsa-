class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int ans = 0, sum = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            int count = m.getOrDefault(rem, 0);
            ans += count;
            m.put(rem, count + 1);
        }
        return ans;
    }
}
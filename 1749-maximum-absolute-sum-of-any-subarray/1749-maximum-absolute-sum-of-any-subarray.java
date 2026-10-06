class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currMax = 0, currMin = 0;
        int best = 0;

        for (int x : nums) {
            currMax = Math.max(x, currMax + x);   
            currMin = Math.min(x, currMin + x);   
            best = Math.max(best, Math.max(currMax, -currMin));
        }
        return best;
    }
}
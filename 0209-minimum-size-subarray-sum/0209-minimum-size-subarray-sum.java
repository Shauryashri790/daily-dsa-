class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int lo=0,hi=0;
        int n = arr.length;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while(hi<n){
            sum += arr[hi];
            while(sum >= target){
                int len = hi-lo+1;
                res = Math.min(res,len);
                sum -= arr[lo];
                lo++;
            }
            hi++;

        }
       return res == Integer.MAX_VALUE ? 0 : res;
    }
}
class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minidx = 0;
        int maxidx  = 0;

        for(int  i=1;i<n;i++){
            if(nums[i] < nums[minidx]){
                minidx = i;
            }
            if(nums[i] > nums[maxidx]){
                maxidx = i;
            }
        }
        int left = Math.min(minidx,maxidx);
         int right = Math.max(minidx,maxidx);
         int removefromfront = right + 1;
         int removefromback = n-left;
         int removefrombothside = (left+1)+(n-right);
         

         return Math.min(removefromfront,Math.min(removefromback,removefrombothside));
    }
}
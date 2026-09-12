class Solution {
    public int removeDuplicates(int[] nums) {
        int ue = 1;
        int  lo= 0,hi=1;
        int n = nums.length;
        while(hi<n){
            if(nums[hi] == nums[hi-1]){
                hi++;
                continue;

            }else if(nums[hi] != nums[hi-1]){
                nums[lo+1] = nums[hi];
                lo++;
                hi++;
                ue++;
            }
        }
        return ue;
        
    }
}
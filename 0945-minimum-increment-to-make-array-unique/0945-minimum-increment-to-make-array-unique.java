class Solution {
    public int minIncrementForUnique(int[] nums) {
        int move=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
              move += nums[i-1]- nums[i]+1;
               nums[i] = nums[i-1]+1;

            }

        }
        return move;
        
    }
}
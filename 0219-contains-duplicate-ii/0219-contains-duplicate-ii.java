class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int idx = 0;
        Map<Integer,Integer> map = new HashMap();
        for(int i:nums){
            if(map.containsKey(i) && Math.abs(idx-map.get(i)) <= k){
                return true;

            }
            else{
                map.put(i,idx);
            }
            idx++;

        }
        return false;
    }
}
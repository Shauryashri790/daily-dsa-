class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res =0;
        int l = 0;
        int r=0;
        char[] arr = s.toCharArray();
        Map<Character,Integer> mp = new HashMap();
        for(;r<arr.length;r++){
          int idx = mp.getOrDefault(arr[r], -1);
          if(idx != -1 && idx>=l){
            res = Math.max(res,r-1-l+1);
            l = idx +1;
             }
            mp.put(arr[r], r);
            }
         return Math.max(res,r-1-l+1);
         }
}
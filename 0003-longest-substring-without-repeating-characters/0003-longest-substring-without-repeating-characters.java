class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lo=0; 
        int n= s.length();
        int res =0;
        char[] arr = s.toCharArray();
        Map<Character,Integer> mp = new HashMap();
        for(int hi=0;hi<n;hi++){
            mp.put(arr[hi],mp.getOrDefault(arr[hi], 0) + 1);
        
          while (mp.size() < hi - lo + 1){
             char lf = arr[lo];
                mp.put(lf, mp.get(lf) - 1);
                if (mp.get(lf) == 0)
                    mp.remove(lf);
                lo++;
             
        }
         res = Math.max(res, hi - lo + 1);

    }
    return res;
    }
}
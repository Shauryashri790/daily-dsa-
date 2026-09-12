class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int idx = 0;
        int i = 0,j=0;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                res[idx] = nums1[i];
                i++;
                idx++;
            }else {
                res[idx] = nums2[j];
                j++;
                idx++;
            }
        }
        while(j<n){
            res[idx] = nums2[j];
            j++;
            idx++;
        }
        while(i<m){
            res[idx] = nums1[i];
            i++;
            idx++;
        }
        
         System.arraycopy(res, 0, nums1, 0, m+n);
    }
}
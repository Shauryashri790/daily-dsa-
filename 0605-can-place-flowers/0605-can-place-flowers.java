class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int s = arr.length;
        for(int i =0;i<s;i++){
            if(arr[i]==0 && (i==0 || arr[i-1]==0) && (i == s-1 || arr[i+1]==0)){
                arr[i] = 1;
                n--;
            }

        }
        return n<=0;
    }
}
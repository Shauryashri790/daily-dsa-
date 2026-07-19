class Solution {
    public int findGCD(int[] arr) {
    Arrays.sort(arr);
        int a = arr[0];                 
        int b = arr[arr.length - 1];     
        return hcf(a, b);
      
     
    }
    public static int hcf(int a, int b){
       
        if(a==0) return b;
     return hcf(b%a,a);
    }
}
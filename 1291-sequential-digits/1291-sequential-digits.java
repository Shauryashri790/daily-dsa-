class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        ArrayList<Integer> ans  = new ArrayList<>();
        for(int l=2;l<10;l++){
            for(int start=0;start<=s.length()-l;start++){
              int digit = Integer.parseInt(s.substring(start, start + l));
                if(digit>=low && digit<=high){
                    ans.add(digit);
                }
            }
        }
        return ans;
    }
}
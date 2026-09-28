class Solution {
    public int maxDepth(String s) {
        int ans = 0, x = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') x++;
            if (c == ')') x--;
            ans = Math.max(ans, x);
        }
        return ans;
    }
}
class Solution {
    public String removeStars(String s) {
        List<Character> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
              list.remove(list.size() - 1);
            } else {
                list.add(c);
            }
        }
         StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}
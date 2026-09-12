class Solution {
    public int compress(char[] chars) {
        String result = "";
        int i = 0;

        while (i < chars.length) {
            char c = chars[i];
            int count = 0;

            while (i < chars.length && c == chars[i]) {
                count++;
                i++;
            }

           
            result = result + c;

           
            if (count > 1) {
                result += count;
            }
        }

    
        for (int j = 0; j < result.length(); j++) {
            chars[j] = result.charAt(j);
        }

        return result.length();
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
            int n = fruits.length;
        int lo = 0, maxLen = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int hi = 0; hi < n; hi++) {
            freq.put(fruits[hi], freq.getOrDefault(fruits[hi], 0) + 1);

            // shrink window if more than 2 fruit types
            while (freq.size() > 2) {
                int leftFruit = fruits[lo];
                freq.put(leftFruit, freq.get(leftFruit) - 1);
                if (freq.get(leftFruit) == 0)
                    freq.remove(leftFruit);
                lo++;
            }

            maxLen = Math.max(maxLen, hi - lo + 1);
        }

        return maxLen;

    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int ri = arr[i] - 1;
            if (arr[i] != arr[ri]) {
                swap(arr, i, ri);   // keep trying to place arr[i] correctly
            } else {
                i++;                // already correct or duplicate, move on
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) ans.add(i + 1);
        }
        return ans;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
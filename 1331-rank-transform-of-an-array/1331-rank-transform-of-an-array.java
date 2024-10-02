class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sort = arr.clone();
        Arrays.sort(sort);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : sort) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
class Solution {
    public int[][] merge(int[][] arr) {
        if (arr.length == 0) return new int[0][];
        
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(arr[i]); 
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
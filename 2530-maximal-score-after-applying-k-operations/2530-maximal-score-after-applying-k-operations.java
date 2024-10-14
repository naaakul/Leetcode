class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i : nums){
            heap.add(i);
        }

        long ans = 0;

        for (int i = 0; i < k; i++) {
            int n = heap.poll();
            ans += n;
            heap.add((int)Math.ceil((double) n / 3));
        }

        return ans;
    }
}
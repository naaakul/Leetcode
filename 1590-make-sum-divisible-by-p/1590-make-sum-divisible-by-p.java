import java.util.HashMap;

public class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long totSum = 0;

        for (int num : nums) {
            totSum += num;
        }

        int tarRem = (int)(totSum % p);
        if (tarRem == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int currMod = 0;
        int min = n;

        for (int i = 0; i < n; i++) {
            currMod = (currMod + nums[i]) % p;
            int requiredMod = (currMod - tarRem + p) % p;

            if (map.containsKey(requiredMod)) {
                min = Math.min(min, i - map.get(requiredMod));
            }

            map.put(currMod, i);
        }

        return (min == n) ? -1 : min;
    }
}

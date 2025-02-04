class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int curr = 0;

        for(int i = 0; i < nums.length; i++){
            curr +=  nums[i];
            ans = Math.max(ans, curr);
            if(curr < 0)curr = 0;
        }

        return ans;
    }
}
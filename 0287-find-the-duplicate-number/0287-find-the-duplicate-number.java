class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = fast;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                int fake = nums[low];
                nums[low++] = nums[mid];
                nums[mid++] = fake;
            }
            else if(nums[mid] == 1)mid++;
            else{
                int fake = nums[high];
                nums[high--] = nums[mid];
                nums[mid] = fake;
            }
        }
    }
}
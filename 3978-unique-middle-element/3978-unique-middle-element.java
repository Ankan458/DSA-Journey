class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length / 2;
        int count = 0;

        for(int num : nums) {
            if(num == nums[mid]) count++;
        }

        return count == 1;
    }
}
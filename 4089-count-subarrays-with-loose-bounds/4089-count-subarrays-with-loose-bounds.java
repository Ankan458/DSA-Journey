class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long len = 0, count = 0;

        for(int num : nums) {
            if(num >= minK && num <= maxK) {
                len += 1;
                count += len;
            }
            else {
                len = 0;
            }
        }

        return count;
    }
}
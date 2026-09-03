class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int currStreak = 1, longestStreak = 1;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1]) {
                if(nums[i + 1] - nums[i] == 1) {
                    currStreak++;
                    longestStreak = Math.max(longestStreak, currStreak);
                }
                else {
                    currStreak = 1;
                }
            }
        }

        return longestStreak;
    }
}
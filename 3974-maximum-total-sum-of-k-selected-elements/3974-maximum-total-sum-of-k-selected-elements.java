class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);

        int high = nums.length - 1;
        int low = nums.length - k;
        long sum = 0;

        for(int i = high; i >= low; i--) {
            sum += (long)nums[i] * (mul > 1 ? mul : 1);
            mul--;
        }

        return sum;
    }
}
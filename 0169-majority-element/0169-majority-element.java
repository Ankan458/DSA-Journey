class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int key = 0;

        for(int num : nums) {
            if(count == 0) {
                count = 1;
                key = num;
            }
            else if(num == key) {
                count++;
            }
            else {
                count--;
            }
        }

        int count1 = 0;

        for(int num : nums) {
            if(num == key) {
                count1++;
            }
        }

        if(count1 > (nums.length / 2)) return key;

        return -1;
    }
}
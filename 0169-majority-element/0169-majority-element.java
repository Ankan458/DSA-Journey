class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for(int key : nums) {
            int frequency = frequencies.getOrDefault(key, 0) + 1;

            frequencies.put(key, frequency);

            if(frequency > (nums.length / 2)) {
                return key;
            }
        }

        return -1;
    }
}
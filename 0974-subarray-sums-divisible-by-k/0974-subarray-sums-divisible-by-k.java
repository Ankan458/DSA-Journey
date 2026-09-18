class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0, count = 0;

        for(int num : nums) {
            prefixSum += num;

            int mod = prefixSum % k;

            if(mod < 0) mod += k;

            count += map.getOrDefault(mod, 0);

            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        return count;
    }
}
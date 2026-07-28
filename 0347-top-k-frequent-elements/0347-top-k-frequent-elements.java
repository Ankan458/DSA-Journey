class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int num : freq.keySet()) {
            int f = freq.get(num);

            if(bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }

            bucket[f].add(num);
        }

        List<Integer> res = new ArrayList();

        for(int i = bucket.length - 1; i >= 1; i--) {
            if(bucket[i] != null) {
                for(int j = 0; j < bucket[i].size() && res.size() < k; j++) {
                    res.add(bucket[i].get(j));
                }
            }
        }

        int[] ans = new int[k];

        for(int i = 0; i < k; i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();

        for(String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        List<String>[] bucket = new ArrayList[words.length + 1];

        for(String word : freq.keySet()) {
            int f = freq.get(word);

            if(bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }

            bucket[f].add(word);
            Collections.sort(bucket[f]);
        }

        List<String> res = new ArrayList<>();

        for(int i = bucket.length - 1; i >= 1; i--) {
            if(bucket[i] != null) {
                for(int j = 0; j < bucket[i].size() && res.size() < k; j++) {
                    res.add(bucket[i].get(j));
                }
            }
        }


        return res;
    }
}
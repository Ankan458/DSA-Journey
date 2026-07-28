class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for(char ch : freq.keySet()) {
            int f = freq.get(ch);

            if(bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }

            bucket[f].add(ch);
        }

        StringBuilder ans = new StringBuilder();

        for(int i = bucket.length - 1; i >= 1; i--) {
            if(bucket[i] == null) continue;

            for(char ch : bucket[i]) {
                for(int j = 0; j < i; j++) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}
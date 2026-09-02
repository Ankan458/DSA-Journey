class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            int[] freq = new int[26];

            for(char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder temp = new StringBuilder();

            for(int count : freq) {
                temp.append('$');
                temp.append(count);
            }

            String key = new String(temp);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
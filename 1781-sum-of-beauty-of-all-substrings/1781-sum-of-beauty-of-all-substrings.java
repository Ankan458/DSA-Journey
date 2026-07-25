class Solution {
    public int beautySum(String s) {
        int ans = 0;

        for(int i = 0;  i < s.length(); i++) {
            int[] freq = new int[26];

            for(int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                int maxF = 0;
                int minF = Integer.MAX_VALUE;

                for(int f : freq) {
                    if(f > 0) {
                        maxF = Math.max(maxF, f);
                        minF = Math.min(minF, f);
                    }
                }

                ans += maxF - minF;
            }
        }

        return ans;
    }
}
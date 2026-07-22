class Solution {
    public int maxDistinct(String s) {
        int[] hash = new int[26];

        for(char ch : s.toCharArray()) hash[ch - 'a']++;

        int count = 0;

        int i = 0;
        while(i < 26) {
            if(hash[i] != 0) count++;
            i++;
        }

        return count;
    }
}
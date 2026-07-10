class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            if((int)word.charAt(i) >= 65 && (int)word.charAt(i) <= 90)
            count++;
        }

        if(((int)word.charAt(0) >= 65 && (int)word.charAt(0) <= 90) && count == 1 || count == word.length() || count == 0)
            return true;

        return false;
    }
}
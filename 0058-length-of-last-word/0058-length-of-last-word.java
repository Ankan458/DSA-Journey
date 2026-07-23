class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        if(s.length() == 1) return 1;

        if(s.matches("[a-zA-Z]+")) return s.length();

        int index = s.length() - 1;
        int count = 0;

        while(index != 0 && s.charAt(index) != ' ') {
            count++;
            index--;
        }

        return count;
    }
}
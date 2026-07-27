class Solution {
    public int largestInteger(int n, int s) {
        if(s == 0) return 0;
        
        if(s > 9 * n) return -1;

        if(n == 1) return s;

        int ans = 0;

        for(int i = 1; i <= n; i++) {
            int digit = Math.min(s, 9);
            ans = ans * 10 + digit;
            s -= digit;
        }

        return ans;
    }
}
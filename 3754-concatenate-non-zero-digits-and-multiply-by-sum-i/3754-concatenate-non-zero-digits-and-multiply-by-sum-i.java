class Solution {
    private int reverse(int num) {
        int rev = 0;

        while(num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        return rev;
    }
    public long sumAndMultiply(int n) {
        if(n == 0) return 0;

        int x = 0;
        int sum = 0;

        while(n != 0) {
            int digit = n % 10;
            
            sum += digit;

            if(digit != 0) {
                x = (x * 10) + digit;
            }

            n /= 10;
        }

        x = reverse(x);

        return (long) x * sum;
    }
}
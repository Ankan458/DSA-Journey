class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0;
        long sum = 0;

        int mod = 1_000_000_007;

        for(int num : arr) {
            sum += num;
            oddCount += sum % 2;
        }

        oddCount += (arr.length - oddCount) * oddCount;

        return (int) (oddCount % mod);
    }
}
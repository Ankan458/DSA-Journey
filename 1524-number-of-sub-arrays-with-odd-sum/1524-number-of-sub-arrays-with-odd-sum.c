int numOfSubarrays(int* arr, int arrSize) {
        long long oddCount = 0;
        long long sum = 0;

        int mod = 1000000007;

        for(int i = 0; i < arrSize; i++) {
            sum += arr[i];
            oddCount += sum % 2;
        }

        oddCount += (arrSize - oddCount) * oddCount;

        return (int) (oddCount % mod);
}
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int n = prices.length - 1;
        int m = discounts.length - 1;

        double price = 0.0;

        while(n >= 0 && m >= 0) {
            price += (double) (prices[n] * (100 - discounts[m])) / 100.0;

            n--;
            m--;
        }

        while(n >= 0) {
            price += prices[n--];
        }

        return price;
    }
}
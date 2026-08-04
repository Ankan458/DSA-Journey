class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        boolean[] contains = new boolean[101];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            contains[num] = true;
        }

        for(int i = min; i <= max; i++) {
            if(!contains[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}
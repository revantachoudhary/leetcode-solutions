class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int[] digits = Integer.toString(nums[i]).chars().map(c -> c - '0').toArray();
            int sum = 0;
            for (int j = 0; j < digits.length; j++) {
                sum += digits[j];
            }
            if (sum == i) return i;
        }
        return -1;
    }
}
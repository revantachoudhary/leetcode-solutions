class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int[] moves = new int[n - 1];
        long[] allMoves = new long[n];

        for (int j = 0; j < n; j++) {
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (i == j) continue;
                sum += Math.abs(nums[i] - nums[j]);
            }
            allMoves[j] = sum;
        }
        
        long min = allMoves[0];
        for (int i = 1; i < n; i++) {
            if (allMoves[i] < min) {
                min = allMoves[i];
            }
        }
        return (int) min;
    }
}

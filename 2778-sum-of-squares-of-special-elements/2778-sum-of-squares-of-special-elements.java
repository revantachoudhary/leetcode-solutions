class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(sum);

            if (nums.length % (i + 1) == 0) {
                System.out.println(nums[i]);
                sum += Math.pow(nums[i], 2);
            }
            System.out.println();
        }
        return sum;
    }
}
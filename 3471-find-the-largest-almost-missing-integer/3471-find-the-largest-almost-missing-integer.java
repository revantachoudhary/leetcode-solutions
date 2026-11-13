class Solution {
    public int largestInteger(int[] nums, int k) {
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> sub = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                sub.add(nums[j]);
            }
            
            for (int num : sub) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1;

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }

        return ans;
    }
}
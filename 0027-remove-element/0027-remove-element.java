class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            }
        }

        int moved = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
				nums[nums.length - 1] = val;
				moved++;
				if (moved == count)
					break;
				i--;
			}
		}

        return nums.length - count;
    }
}
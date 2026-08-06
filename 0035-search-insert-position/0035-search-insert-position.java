import java.util.Arrays;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        if (i >= 0) return i;
        else return -i - 1;
    }
}

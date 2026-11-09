class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        Arrays.sort(nums);
        int[] table = new int[1000 / k];
        int sum = k;

        for (int i = 0; i < table.length; i++) {
            table[i] = sum;
            sum += k;
        }

        System.out.println(Arrays.toString(table));

        for (int i = 0; i < table.length; i++) {
            if (Arrays.binarySearch(nums, table[i]) < 0) {
                return table[i];
            }
        }
        return 0;
    }
}
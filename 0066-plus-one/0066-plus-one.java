class Solution {
    public int[] plusOne(int[] digits) {
        int f = digits.length - 1;

        int carry = 1;

        for (int i = f; i >= 0 && carry == 1; i--) {
            digits[i] += carry;

            if (digits[i] == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                carry = 0;
            }
        }

        if (carry == 1) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        } else {
            return digits;
        }
                
    }
}

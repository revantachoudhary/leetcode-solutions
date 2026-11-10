class Solution {
    public boolean checkDivisibility(int n) {
        int n1 = n;
        int s1 = 0;
        int s2 = 1;
        while (n1 != 0) {
            s1 += n1 % 10;
            s2 *= n1 % 10;
            n1 /= 10;
        }
        if (n % (s1 + s2) == 0) return true;
        return false;
    }
}

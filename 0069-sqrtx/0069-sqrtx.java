class Solution {
    public int mySqrt(int x) {
        int mid = x / 2;
        while (!((long) mid * mid <= x)) {
            mid /= 2;
        }
        while ((long) mid * mid <= x) {
            mid++;
        }
        mid--;
        return mid;
    }
}

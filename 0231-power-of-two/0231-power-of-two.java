class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Keep dividing n by 2 if it's even
        while (n % 2 == 0) {
            n /= 2;
        }
        // If n becomes 1, then it's a power of two
        return n == 1;
    }
}
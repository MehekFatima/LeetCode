class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            // Handle negative exponent by taking the reciprocal
            x = 1 / x;
            // Convert n to positive to use binary exponentiation
            n = -n;
        }
        return powRec(x, n);
    }

    private double powRec(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double half = powRec(x, n / 2);
        
        if (n % 2 == 0) {
            // If n is even, square the result of half
            return half * half;
        } else {
            // If n is odd, multiply half by itself and also by x
            return half * half * x;
        }
    }
}
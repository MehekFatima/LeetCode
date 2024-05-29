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

    private double powRec(double x, int n){
        if(n==0){
            return 1.0;
        }
        if(x==0){
            return 0.0;
        }
        double power;
        if(n%2==0){
            double half =  powRec(x,n/2);
            power = half*half;
        }
        else{
            double half =  powRec(x,n/2);
            power = half*half*x;
        }
        return power;
    }
}
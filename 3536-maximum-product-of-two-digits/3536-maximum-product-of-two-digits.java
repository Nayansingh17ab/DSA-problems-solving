class Solution {
    public int maxProduct(int n) {
        int prod =1;
        int max  = 0;
        int secondmax=0;
        while(n>0){
            int digit = n%10;
            if(digit >=max){
                secondmax = max;
                max=digit;
            }else if(digit < max && digit >secondmax){
                secondmax = digit;
            }
            n=n/10;

        }
        return max*secondmax;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
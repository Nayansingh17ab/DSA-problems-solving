class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int n = nums.length;
        int max=0;
        int indexi=0;
        int indexj=0;
    
        int secmax=0;
       
        for (int i=0;i<n;i++){
            if(nums[i]>=max){
                secmax=max;
                indexi=indexj;
                max=nums[i];
                indexj=i;
                }else if(nums[i]<max && nums[i]>=secmax){
                    secmax=nums[i];
                    indexi=i;
                }
        }
        prod=(nums[indexi]-1)*(nums[indexj]-1);
       
        return prod;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
       int [] prefix = new int [n];  
       int [] suffix = new int [n];
       for(int i=0;i<n;i++){
        if (i==0) prefix [0]=1;
         else prefix[i]=prefix[i-1] * nums[i-1];
       }
       for (int i=n-1;i>=0;i--){
        if (i==n-1) suffix[i]=1;
        else suffix [i] =suffix[i+1] * nums[i+1];
       }
       int [] result = new int [n];
       for (int k=0;k<n;k++){
        result[k]=prefix[k]*suffix[k];
       }
       return result;
    }
}  

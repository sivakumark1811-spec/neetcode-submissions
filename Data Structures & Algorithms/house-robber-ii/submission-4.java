class Solution {
    public int rob(int[] nums) {
        int n= nums.length-1;
        if (n==0) return nums[0];
        if (n==1) return Math.max(nums[0],nums[1]);
        int a =0;
        int b=0;
        int[] a1=nums.clone();
        for (int i=3;i<n+1;i++){
            if (i==3){
                a1[i]+=a1[i-2];
            }
            else {
                a1[i]+=Math.max(a1[i-2],a1[i-3]);
            }
        }
        a=Math.max(a1[n],a1[n-1]);
        int[] b1=nums.clone();
        for (int i=2;i<n+1;i++){
            if (i==2){
                b1[i]+=b1[i-2];
            }
            else {
                b1[i]+=Math.max(b1[i-2],b1[i-3]);
            }
        }
        b=Math.max(b1[n-2],b1[n-1]);
        return Math.max(a,b);
    }
}

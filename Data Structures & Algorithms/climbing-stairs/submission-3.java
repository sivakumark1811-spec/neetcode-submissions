class Solution {
    int[] ans;
    public int climbStairs(int n) {
        if (n==1) return 1;
        ans = new int[n + 1];
        Arrays.fill(ans, -1);
        ans[0] = 0;
        ans[1] = 1;
        ans[2]=2;
        return solve(n);
        
        


    }
    public int solve(int n) {
        if (ans[n] != -1)
            return ans[n];
        else ans[n]=solve(n - 1) + solve(n - 2);
        return ans [n];
    }
}

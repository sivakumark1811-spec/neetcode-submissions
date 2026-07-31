class Solution {
    int[] ans;
    public int climbStairs(int n) {
        ans = new int[n + 1];
        Arrays.fill(ans, -1);
        ans[0] = 1;
        ans[1] = 1;
        
        return solve(n);
        
        


    }
    public int solve(int n) {
        if (ans[n] != -1)
            return ans[n];
        else ans[n]=solve(n - 1) + solve(n - 2);
        return ans [n];
    }
}

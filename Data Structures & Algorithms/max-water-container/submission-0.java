class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
       int i=0;
       int j= n-1;
       int max =0;
       while(i<j){
            int value = Math.min(height[i],height[j]) * (j-i);
            max=Math.max(max,value);
            if (height[i]>height[j]){
                j--;
            }
            else if (height[i]<=height[j]){
                i++;
            }
       }
       return max;
    }
}

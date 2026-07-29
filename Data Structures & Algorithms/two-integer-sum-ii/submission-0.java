class Solution {
    public int[] twoSum(int[] num, int target) {
        int i=0;
        int j = num.length-1;
        while(i<j){
            int a =num[i]+num[j];
            if (a>target) j--;
            else if(a<target) i++;
            else if (a==target) return new int []{i+1,j+1};
        }
        return new int []{};
    }
}

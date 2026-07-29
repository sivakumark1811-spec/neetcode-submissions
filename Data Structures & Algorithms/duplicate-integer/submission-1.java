class Solution {
    public boolean hasDuplicate(int[] nums) {
       int i=0,count=0; 
       Arrays.sort(nums);
       while(i<nums.length-1){
        if (nums[i]==nums[i+1]){
            count++;
        }
        i++;
       }
       if (count>0) return true;
       return false; 
    }
}
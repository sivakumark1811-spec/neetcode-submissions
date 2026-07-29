class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int max=0;
        for (int num:nums){
            if (set.contains(num-1)) continue;
            int count =1;
            while(set.contains(num+1)){
                count++;
                num++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}

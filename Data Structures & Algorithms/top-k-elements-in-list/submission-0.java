class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int [] ans = new int[k];
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int i=0;
        while(i<k){
            int maxNum=-100000;
            int count =0;
            for (int key:map.keySet()){
                int a =map.get(key);
                if (a>count){
                    count=a;
                    maxNum=key; 
                }
            }
            ans[i]=maxNum;
            i++;
            map.remove(maxNum);
        }
        return ans;
    }
}

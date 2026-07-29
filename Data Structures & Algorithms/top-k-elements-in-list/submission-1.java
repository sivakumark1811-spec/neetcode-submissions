class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int [] ans = new int[k];
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<int[]> list =new ArrayList<>();
        for (Map.Entry<Integer,Integer> x:map.entrySet()){
            list.add(new int [] {x.getKey(),x.getValue()});
        }
        Collections.sort(list,(a,b)->b[1]-a[1]);
        for (int i =0;i<k;i++){
            ans[i]=list.get(i)[0];
        }
        return ans;
    }
}

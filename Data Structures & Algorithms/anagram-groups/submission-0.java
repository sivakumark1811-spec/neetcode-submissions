class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<Integer>> map = new HashMap<>();
        for ( int i=0;i<strs.length;i++){
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String (ch);
            List <Integer> list =map.getOrDefault(s,new ArrayList<>());
            list.add(i);
            map.put(s,list);
        }
        List <List<String>> result = new ArrayList<>();
        for (int i=0;i<map.size();i++){
            result.add(new ArrayList<>());
        }
        int j=0;
        for(String key: map.keySet()){
            List<Integer> ans = map.get(key);
            for (int i:ans){
                result.get(j).add(strs[i]);
            }
            j++;
        }
        return result;
    }
}

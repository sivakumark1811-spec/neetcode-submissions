class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for ( int i=0;i<strs.length;i++){
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String (ch);
            List <String> list =map.getOrDefault(s,new ArrayList<>());
            list.add(strs[i]);
            map.put(s,list);
        }
        List <List<String>> result = new ArrayList<>();
        
            for(String key:map.keySet()){
                List<String> ans = map.get(key);
                result.add(ans);
            }
        
        
        return result;
    }
}

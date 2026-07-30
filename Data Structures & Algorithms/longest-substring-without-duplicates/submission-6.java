class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        int left = 0;
        char [] ch =s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int right = 0;right<ch.length;right++){
            if (set.contains(ch[right])){
                max=Math.max(max,set.size());
                while(set.contains(ch[right])){
                    set.remove(ch[left]);
                    left++;
                }
            }
            set.add(ch[right]);
            if (right==ch.length-1) return Math.max(max,set.size());
        }
        return max;
    }
}

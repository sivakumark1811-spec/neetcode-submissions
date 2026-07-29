class Solution {
    public boolean isAnagram(String s, String t) {
        int [] containsOfS = new int [26];
        for (char ch :s.toCharArray()){
            int a = ch - 'a';
            containsOfS[a]++;
        }
        int [] containsOfT = new int [26];
        for (char ch :t.toCharArray()){
            int a = ch - 'a';
            containsOfT[a]++;
        }
        for (int i=0;i<26;i++){
            if (containsOfS[i]!=containsOfT[i]) return false;
        }
        return true;
    }
}

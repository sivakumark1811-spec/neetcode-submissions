class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (String s1 :s.split(" ")){
            sb.append(s1);
        }
        char [] ch = sb.toString().toCharArray();
        int n = ch.length;
        int i=0;
        int j=n-1;
        while(i<j){
            
            if (!Character.isLetterOrDigit(ch[i])){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(ch[j])){
                j--;
                continue;
            }
            if (Character.toLowerCase(ch[i])!=Character.toLowerCase(ch[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

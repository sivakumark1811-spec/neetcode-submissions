class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        HashMap <Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for (char c : s.toCharArray()){
            if (c =='(' || c =='{' || c =='[' ){
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;
                if (map.get(stack.peek())==c) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}

class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> reverse = new HashMap<>();

        reverse.put(')', '(');
        reverse.put('}', '{');
        reverse.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {

            char c = s.charAt(i);

            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            }
            else {
                if (!stack.isEmpty() && stack.peek()==reverse.get(c)) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }       
        }

        return stack.isEmpty();
    }
}

//Time complexity = O(n)
//Space complexity = O(n)
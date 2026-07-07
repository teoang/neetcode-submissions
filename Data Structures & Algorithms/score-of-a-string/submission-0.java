class Solution {
    public int scoreOfString(String s) {
        char prec_char = s.charAt(0);
        int prec = (int) prec_char;
        int diff = 0;
        for(int i=1; i<s.length(); i++) {
            char current_char = s.charAt(i);
            int current = (int) current_char;
            diff+= Math.abs(current - prec);
            prec = current;
        }

        return diff;
    }
}

// Time: O(n)
// Space: O(1)
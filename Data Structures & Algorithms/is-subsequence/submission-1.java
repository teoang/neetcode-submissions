class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }
        
        if(s.length()>t.length()) {
            return false;
        }

        int point_s = s.length()-1;
        int point_t = t.length()-1;

        while(point_s>=0) {
            if (s.charAt(point_s) == t.charAt(point_t)) {
                if(point_s==0) {
                    return true;
                }
                point_t--;
                point_s--;
            }
            else {
                if (point_t==0) {
                    return false;
                }
                point_t--;
            }
        }

        return false;
    }
}

// Time Complexity: O(t.length())
// We scan string t at most once from right to left.
//
// Space Complexity: O(1)


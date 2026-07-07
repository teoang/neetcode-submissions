class Solution {
    public String longestCommonPrefix(String[] strs) {

        int minLen = strs[0].length();
        for (String s : strs) {
            if (s.length() < minLen) {
                minLen = s.length();
            }
        }

        for(int punt=0; punt<minLen; punt++) {
            char init = strs[0].charAt(punt);
            for(String s : strs) {
                char init_s = s.charAt(punt);
                if (init_s != init) {
                    return s.substring(0,punt);
                }
            }
        }

        return strs[0].substring(0,minLen);
    }
}

// Time complexity: O(n*m), where n is the number of strings
// and m is the length of the shortest string.
//
// Space complexity: O(1)
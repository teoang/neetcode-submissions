class Solution {
    public int lengthOfLastWord(String s) {
        int punt = s.length() - 1;
        int len = 0;

        while (punt >= 0 && s.charAt(punt) == ' ') {
            punt--;
        }

        while (punt >= 0 && s.charAt(punt) != ' ') {
            len++;
            punt--;
        }

        return len;
    }
}

// Time: O(n)
// Space: O(1)
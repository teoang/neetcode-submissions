// Brute force solution

class Solution {
    public List<String> stringMatching(String[] words) {

        List<String> list = new ArrayList<>();

        for(String s : words) {
            for(String t : words) {
                if (s.contains(t) && !s.equals(t) && !list.contains(t)) {
                    list.add(t);
                }
            }
        }

        return list;
    }
}

// Time Complexity: O(n^2 * m^2), where n is the number of words
// and m is the maximum word length. For each pair of words, contains()
// may compare characters in O(m^2) in the worst case.
// Space Complexity: O(1)
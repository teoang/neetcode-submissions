class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character, Integer>, List<String>> global = new HashMap<>();

        for (String word : strs) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (Character i : word.toCharArray()) {
                Integer counter = map.getOrDefault(i, 0);
                map.put(i, ++counter);
            }

            /*
                {e} -> [1]
                {a} -> [1]
                {t} -> [1]
            */

            if (!global.containsKey(map)) {
                List<String> list = new ArrayList<>();
                list.add(word);
                global.put(map, list);

            /*
                {{e=1, a=1, t=1} -> ["eat", "tea", "ate"]}
            */

            }
            else {
                global.get(map).add(word);
            }
        }

        return new ArrayList<>(global.values());

    }
}

/*
Complexity analysis:

Let:
n = number of words in strs
k = maximum length of a word

For each word, we count its characters.

Example:
"eat" -> {e=1, a=1, t=1}
"tea" -> {t=1, e=1, a=1}

These two character counts are equal, so they belong to the same anagram group.

We use the character count as the key in the global HashMap:

character count -> list of words

Example:
{a=1, e=1, t=1} -> ["eat", "tea", "ate"]

1) We iterate over all words.
   There are n words.

2) For each word, we scan all of its characters.
   Each word has at most k characters.

   Cost per word: O(k)
   Cost for all words: O(n * k)

3) After building the character count, we use it as a key in the global HashMap.
   Operations like containsKey, put, and get are O(1) on average with respect to the number of groups.

   Since the key is itself a HashMap<Character, Integer>, Java still needs to compute the hashCode of that key. This means looking at the entries inside the character count.

   With lowercase English letters, the character count has at most 26 entries. So this cost is O(26), which is O(1).

4) Adding the word to the corresponding list is O(1) amortized.

5) At the end, new ArrayList<>(global.values()) copies all groups into the result list.
   The number of groups is at most n, so this costs O(n).
   This does not change the overall complexity because O(n * k) is the dominant term.

Total time complexity:
O(n * k)

Space complexity:
The global HashMap stores the groups and their character counts.
With lowercase English letters, each character count has at most 26 entries, so each key takes O(1) space.

The lists store all n words in total.

Total space complexity:
O(n), excluding the output depending on convention.
*/

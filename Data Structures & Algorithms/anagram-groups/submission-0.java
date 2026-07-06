class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character, Integer>, List<String>> global = new HashMap<>();

        for (String word : strs) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (Character i : word.toCharArray()) {
                Integer counter = map.getOrDefault(i, 0);
                map.put(i, ++counter);
            }

            if (!global.containsKey(map)) {
                List<String> list = new ArrayList<>();
                list.add(word);
                global.put(map, list);
            }
            else {
                global.get(map).add(word);
            }
        }

        return new ArrayList<>(global.values());

    }
}

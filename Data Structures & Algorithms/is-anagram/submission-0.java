class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }

        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        int count=0;
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(hm.containsKey(char1[i])) {
                count=hm.get(char1[i])+1;
                hm.put(char1[i], count);
            }
            else {
                count=1;
                hm.put(char1[i], count);
            }
        }   

        for(int i=0; i<t.length(); i++) {
            if(hm.containsKey(char2[i])) {
                count=hm.get(char2[i])-1;
                hm.put(char2[i], count);
            }
            else {
                count=-1;
                hm.put(char2[i], count);
            }
        }

        for(int i=0; i<s.length(); i++) {
            if (hm.get(char1[i])!=0) {
                return false;
            }
        }
        
        return true;  
    }
}

// More costly solution

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
        {
            return false;
        }

        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}

//Time complexity = O(nlogn)
//Space complexity = O(n) 
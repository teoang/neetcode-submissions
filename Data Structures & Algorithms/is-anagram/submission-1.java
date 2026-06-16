class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }

        int count=0;
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(hm.containsKey(s.charAt(i))) {
                count=hm.get(s.charAt(i))+1;
                hm.put(s.charAt(i), count);
            }
            else {
                count=1;
                hm.put(s.charAt(i), count);
            }
        }   

        for(int i=0; i<t.length(); i++) {
            if(hm.containsKey(t.charAt(i))) {
                count=hm.get(t.charAt(i))-1;
                hm.put(t.charAt(i), count);
            }
            else {
                count=-1;
                hm.put(t.charAt(i), count);
            }
        }

        for(int i=0; i<s.length(); i++) {
            if (hm.get(s.charAt(i))!=0) {
                return false;
            }
        }
        
        return true;  
    }
}

//Time complexity = O(n)
//Space complexity = O(1)

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
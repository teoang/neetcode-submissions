// Solution with HashSet

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            if (hs.add(nums[i])==false) {
                return true;
            }
        }
        return false;
    }
}

// Solution with HashMap

class Solution2 {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();  

        for (int i=0; i<nums.length; i++){
            if (hm.containsKey(nums[i])) {
                return true;
            }
            else {
                hm.put(nums[i], true);
            }
        }
        return false;
    }
}

//Time complexity = O(n)
//Space complexity = O(n)

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int current=0;
        int punt=0;
        while(punt<nums.length) {
            if (nums[punt]==1) {
                current++;
                if (current>max) {
                    max = current;
                }
                punt++;
            }
            else {
                current=0;
                punt++;
            }
        }
        return max;
    }
}

// Time: O(n), Space: O(1)
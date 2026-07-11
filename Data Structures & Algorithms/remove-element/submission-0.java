class Solution {
    public int removeElement(int[] nums, int val) {
        int punt1 = 0;
        int punt2 = 0;

        while(punt2<nums.length) {
            if (nums[punt2]==val) {
                punt2++;
            }
            else {
                nums[punt1]=nums[punt2];
                punt1++;
                punt2++;
            }
        }

        return punt1;
    }
}

// Time complexity: O(n), because the second pointer scans the array once.
// Space complexity: O(1), because the array is modified in-place using only two pointers.

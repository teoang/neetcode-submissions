class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = arr[arr.length-1];

        for(int i=arr.length-2; i>=0; i--) {
            int temp = max;
            if (arr[i] > max ) {
                max = arr[i];
            }
            arr[i]=temp;
        }

        arr[arr.length-1] = -1;

        return arr;
    }
}

//Time complexity = O(n)
//Space complexity = O(1)
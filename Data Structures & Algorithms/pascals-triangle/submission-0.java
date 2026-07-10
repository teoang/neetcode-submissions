class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(0,new ArrayList<>(List.of(1)));

        for(int i=1; i<numRows; i++) {
            List<Integer> temp = list.get(i-1);
            List<Integer> list_i = new ArrayList<>();
            list_i.add(0,1);
            for(int j=1; j<temp.size(); j++) {
                int prec = temp.get(j-1);
                int curr = temp.get(j);
                list_i.add(j,prec+curr);
            }
            list_i.add(temp.size(),1);
            list.add(i,list_i);
        }
        return list;
    }
}   

// Time complexity: O(n²), where n is numRows.
// Each row contains one more element than the previous row, so the total
// number of generated elements is 1 + 2 + ... + n = n(n + 1) / 2.

// Space complexity: O(n²).
// The result stores every row of Pascal's triangle, containing a total of
// n(n + 1) / 2 elements. 
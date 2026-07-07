class Solution {
    public int countSeniors(String[] details) {
        int first_num;
        int second_num;
        int age;
        int count=0;
        for(String s : details) {
            first_num = (s.charAt(11) - '0') * 10;
            second_num = s.charAt(12) - '0';
            age = first_num + second_num;
            if (age>60) {
                count++;
            }
        }

        return count;
    }
}

// Time: O(details.length)
// Space: O(1)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //Base case (empty list)

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        int val_a = list1.val;
        int val_b = list2.val;

        ListNode final_list = new ListNode();
        ListNode temp_list = new ListNode();

        if (val_a <= val_b) {
            final_list = list1;
            temp_list = list1.next;

            final_list.next = mergeTwoLists(temp_list, list2);
        }
        else {
            final_list = list2;
            temp_list = list2.next;

            final_list.next = mergeTwoLists(list1, temp_list);
        }

        return final_list;
    }
}
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode checker1 = l1;
        ListNode checker2 = l2;
        int carryUp = 0;
        int target_val = 0;
        ListNode target = new ListNode();
        ListNode targetStartNode = target;

        while (checker1 != null || checker2 != null){

            target_val = carryUp;
            if (checker1 != null)
                target_val += checker1.val;
            if (checker2 != null)
                target_val += checker2.val;


            carryUp = target_val / 10;
            target.val = target_val % 10;

            if (checker1 != null)
                checker1 = checker1.next;
            if (checker2 != null)
                checker2 = checker2.next;


            if(checker1 != null || checker2 != null){
                ListNode nextTarget = new ListNode();
                ListNode temp = new ListNode();
                target.next = nextTarget;
                target = nextTarget;
            }

            if(checker1 == null && checker2 == null){
                if(carryUp == 1){
                    ListNode nextTarget = new ListNode();
                    target.next = nextTarget;
                    nextTarget.val = carryUp;
                }
            }

        }

        return targetStartNode;
    }
}

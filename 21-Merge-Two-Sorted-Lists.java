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
        ListNode answer = new ListNode();
        ListNode head = new ListNode();
        if(list1 == null && list2 == null){
            return null;
        }else if(list1 == null){
            answer.val = list2.val;
            list2 = list2.next;
            head = answer;
        }else if(list2 == null){
            answer.val = list1.val;
            list1 = list1.next;
            head = answer;
        }else{
            if(list1.val < list2.val){
                answer.val = list1.val;
                list1 = list1.next;
                head = answer;
            }else{
                answer.val = list2.val;
                list2 = list2.next;
                head = answer;
            }
        }
        while(list1 != null || list2 != null){
            if(list1 != null && list2 != null ){
                if(list1.val > list2.val){
                    ListNode node = new ListNode(list2.val);
                    answer.next = node;
                    answer = answer.next;
                    list2 = list2.next;
                }else{
                    ListNode node = new ListNode(list1.val);
                    answer.next = node;
                    answer = answer.next;
                    list1 = list1.next;
                }
            }else if(list1 == null){
                ListNode node = new ListNode(list2.val);
                answer.next = node;
                answer = answer.next;
                list2 = list2.next;
            }else if(list2 == null){
                ListNode node = new ListNode(list1.val);
                answer.next = node;
                answer = answer.next;
                list1 = list1.next;
            }
        }
        return head;
    }
}
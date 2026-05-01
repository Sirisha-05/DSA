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
    public int pairSum(ListNode head) {
        ArrayList<Integer>l=new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        int max=0;
        int n=l.size();
        for(int i=0;i<n/2;i++){
            max=Math.max(max,l.get(i)+l.get(n-i-1));
        }
        return max;
    }
}
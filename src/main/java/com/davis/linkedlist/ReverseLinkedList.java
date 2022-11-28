package com.davis.linkedlist;

public class ReverseLinkedList {

   class ListNode {
       int val;
       ListNode next;

       ListNode() {
       }

       ListNode(int val) {
           this.val = val;
       }

       ListNode(int val, ListNode next) {
           this.val = val;
           this.next = next;
       }
   }

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode nextNode=head.next;
        ListNode newHead=reverseList(nextNode);
        nextNode.next=head;
        head.next=null;
        return newHead;
    }
    public void init(){
        ListNode head =  new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
       ListNode res =   new ReverseLinkedList().reverseList(head);
        ListNode next  = res;
         while( next !=null){
           System.out.println(next.val);
           next = next.next;
       }
    }
    public static void main(String[] args) {
        new ReverseLinkedList().init();
    }
}

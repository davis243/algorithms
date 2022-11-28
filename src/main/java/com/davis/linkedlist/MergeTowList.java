package com.davis.linkedlist;

public class MergeTowList {

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if( list2 == null){
            return list1;
        }

        if( list1 == null){
            return list2;
        }

        ListNode result = new ListNode();
        if(list1 !=null){
            if(list1.val > list2.val){
                result.val = list2.val;
                result.next = mergeTwoLists(list2.next, list1);
            }else{
                result.val = list1.val;
                result.next = mergeTwoLists(list1.next, list2);
            }
        }

        return result;
    }
}

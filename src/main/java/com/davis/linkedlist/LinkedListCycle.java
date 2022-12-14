package com.davis.linkedlist;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {


      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
             next = null;
         }
      }



        public boolean hasCycle(ListNode head) {

            if(head == null) return false;

            ListNode walker = head;
            ListNode runner = head;
            while(runner.next != null && runner.next.next !=null){
                walker = walker.next;
                runner = runner.next.next;
                if( walker == runner) return true;
            }
            return false;
        }

    public static void main(String[] args) {

    }
}

package com.guren.arithmetic.sum;

import com.guren.arithmetic.payload.ListNode;

public class LinkedListTheSumOfTheTwo {
  public static void main(String[] args) {
    ListNode next1 = ListNode.getListNodeThreeNodes(2, 1, 5);
    ListNode next2 = ListNode.getListNodeThreeNodes(7, 5, 8);

    int val1;
    int val2;
    int sum = 0;
    int a = 0;
    ListNode next = new ListNode(sum);

    while (next1 != null || next2 != null) {
      if (next1 != null) {
        val1 = next1.getVal();
        next1 = next1.getNext();
      } else {
        val1 = 0;
      }
      if (next2 != null) {
        val2 = next2.getVal();
        next2 = next2.getNext();
      } else {
        val2 = 0;
      }
      sum = val1 + val2 + a;
      a = 0;
      if (sum > 9) {
        sum = sum - 10;
        a = 1;
      }
      next.setVal(sum);
      if (next1 != null || next2 != null || a == 1){
        next.setNext(new ListNode(a));
        next = next.getNext();
      }
    }
  }
}

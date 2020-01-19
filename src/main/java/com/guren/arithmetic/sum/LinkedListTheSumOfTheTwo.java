package com.guren.arithmetic.sum;

import com.guren.arithmetic.payload.ListNode;

public class LinkedListTheSumOfTheTwo {
  public static void main(String[] args) {
    ListNode next1 = new ListNode(2);
    ListNode listNode11 = new ListNode(1);
    ListNode listNode12 = new ListNode(5);
    ListNode next2 = new ListNode(7);
    ListNode listNode21 = new ListNode(5);
    ListNode listNode22 = new ListNode(8);
    listNode11.setNext(listNode12);
    next1.setNext(listNode11);
    listNode21.setNext(listNode22);
    next2.setNext(listNode21);

    int val1 = 0;
    int val2 = 0;
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

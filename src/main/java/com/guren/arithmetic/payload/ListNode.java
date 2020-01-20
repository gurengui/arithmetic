package com.guren.arithmetic.payload;

public class ListNode {
    private int val;
    private ListNode next;

    public static ListNode getListNodeThreeNodes(int a, int b, int c) {
        ListNode next = new ListNode(a);
        ListNode listNode1 = new ListNode(b);
        ListNode listNode2 = new ListNode(c);
        listNode1.setNext(listNode2);
        next.setNext(listNode1);
        return next;
    }

    public static void listLinked(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.getVal());
            listNode = listNode.getNext();
        }
    }

    public ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode() {
    }
}

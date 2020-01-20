package com.guren.arithmetic.merge;

import com.guren.arithmetic.payload.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MergeTwoOrderedLinkedLists {
    public static void main(String[] args) {
        ListNode l1 = ListNode.getListNodeThreeNodes(1, 2, 4);
        ListNode l2 = ListNode.getListNodeThreeNodes(1, 3, 4);
        ListNode result = mergeLinkedList(l1, l2);
        ListNode.listLinked(result);
    }

    private static ListNode mergeLinkedList(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.getVal() < l2.getVal()) {
            l1.setNext(mergeLinkedList(l1.getNext(), l2));
            return l1;
        } else {
            l2.setNext(mergeLinkedList(l1, l2.getNext()));
            return l2;
        }
    }
}

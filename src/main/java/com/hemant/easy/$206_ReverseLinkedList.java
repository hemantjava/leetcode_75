package com.hemant.easy;

public class $206_ReverseLinkedList {
    public static class ListNode {
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

        public void print(ListNode listNode) {
            while (listNode != null) {
                System.out.print(listNode.val+" ");
                listNode = listNode.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(2);
        ll.next.next = new ListNode(3);
        ll.next.next.next = new ListNode(4);
        ll.print(ll);
        ListNode revered = reverseList(ll);
        ll.print(revered);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode pre = null;
        ListNode current = head;

        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}

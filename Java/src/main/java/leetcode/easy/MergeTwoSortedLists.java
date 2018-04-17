package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-15 21:50
 * *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * *
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode head = null;

    public ListNode inserNode(int[] array) {
        head = new ListNode(array[0]);
        ListNode l = head;
        for (int i = 1; i < array.length; i++) {
            ListNode listNode = new ListNode(array[i]);
            l.next = listNode;
            l = l.next;
        }

        return head;
    }

    public void displayListNode(ListNode l) {
        while (l != null) {
            System.out.print(l.val);
            l = l.next;
        }
        System.out.println();
    }


    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }

            p = p.next;
        }

        if (l1 != null) {
            p.next = l1;
        }

        if (l2 != null) {
            p.next = l2;
        }

        return dummy.next;

    }

    // 此解法有问题
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 4, 6};
        int[] array2 = {1, 3, 5};

        MergeTwoSortedLists list1 = new MergeTwoSortedLists();
        ListNode head1 = list1.inserNode(array1);
        list1.displayListNode(head1);

        MergeTwoSortedLists list2 = new MergeTwoSortedLists();
        ListNode head2 = list2.inserNode(array2);
        list2.displayListNode(head2);

        ListNode head = null;

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        head = mergeTwoSortedLists.mergeTwoLists1(head1, head2);
        mergeTwoSortedLists.displayListNode(head);
    }
}

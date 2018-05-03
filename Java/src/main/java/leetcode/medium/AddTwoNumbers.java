package leetcode.medium;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author apktool
 * @date 2018-05-02 20:29
 * *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * *
 * Example
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */


@RequiredArgsConstructor
class ListNodeTN {
    @NonNull
    int val;
    ListNodeTN next;
}

class LinkListTN {
    @Getter
    transient ListNodeTN head;

    public void buildLinkListTN(int[] values) {
        head = createLinkListTN(new ListNodeTN(-1), values);
    }

    public ListNodeTN createLinkListTN(ListNodeTN head, int[] values) {
        ListNodeTN p = head;
        for (int vals : values) {
            ListNodeTN q = new ListNodeTN(vals);
            p = head.next;
            head.next = q;
            q.next = p;
        }
        return head;
    }

    public void display(ListNodeTN head) {
        ListNodeTN p = head.next;
        while (p != null) {
            System.out.printf("%d ", p.val);
            p = p.next;
        }
        System.out.println();
    }

}


public class AddTwoNumbers {
    public ListNodeTN addTwoNumbers1(ListNodeTN l1, ListNodeTN l2) {
        ListNodeTN head = new ListNodeTN(-1);
        ListNodeTN p = head;
        ListNodeTN l = head;
        int carray = 0;

        while (l1 != null && l2 != null) {
            l = new ListNodeTN(l1.val + l2.val + carray);
            if (l.val > 9) {
                carray = 1;
                l.val = l.val % 10;
            } else {
                carray = 0;
            }

            p.next = l;
            p = l;

            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) {
            l = l1;
        } else {
            l = l2;
        }

        while (l != null) {
            l.val = l.val + carray;
            if (l.val > 9) {
                carray = 1;
                l.val = l.val % 10;
            } else {
                carray = 0;
            }
            p.next = l;
            p = l;
            l = l.next;
        }

        if (carray == 1) {
            p.next = new ListNodeTN(1);
        }

        return head;
    }

    public ListNodeTN addTwoNumbers2(ListNodeTN l1, ListNodeTN l2) {
        ListNodeTN dummyHead = new ListNodeTN(0);
        ListNodeTN p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNodeTN(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNodeTN(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 3};
        int[] b = {5, 6, 4};

        LinkListTN list1 = new LinkListTN();
        list1.buildLinkListTN(a);
        ListNodeTN head1 = list1.getHead();
        list1.display(head1);

        LinkListTN list2 = new LinkListTN();
        list2.buildLinkListTN(b);
        ListNodeTN head2 = list2.getHead();
        list2.display(head2);

        AddTwoNumbers haha = new AddTwoNumbers();

//        ListNodeTN h1 = haha.addTwoNumbers1(head1.next, head2.next);
//        new LinkListTN().display(h1);

        ListNodeTN h2 = haha.addTwoNumbers1(head1.next, head2.next);
        new LinkListTN().display(h2);
    }
}

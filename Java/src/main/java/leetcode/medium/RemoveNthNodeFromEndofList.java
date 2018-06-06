package leetcode.medium;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author apktool
 * @date 2018-06-06 22:10
 * *
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * <p>
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * <p>
 * Note:
 * Given n will always be valid.
 * Follow up:
 * Could you do this in one pass?
 */

@RequiredArgsConstructor
@Getter
@Setter
class NodeFEL {
    @NonNull
    int value;
    NodeFEL next;
}

class LinkListFEL {
    @Getter
    transient NodeFEL head;

    public void createLinkListFEL(int[] values) {
        head = buildLinkListFEL(new NodeFEL(-1), values);
    }

    private NodeFEL buildLinkListFEL(NodeFEL head, int[] values) {
        NodeFEL p = head;

        for (int val : values) {
            NodeFEL q = new NodeFEL(val);
            p.setNext(q);
            p = q;
        }

        return head;
    }

    public void display() {
        NodeFEL p = head.next;

        while (p != null) {
            System.out.print(p.getValue());
            p = p.getNext();
        }
        System.out.println();
    }

    public void removeNthFromEnd(int n) {
        NodeFEL p = head.next;
        NodeFEL q = head.next;

        if (q.next == null) {
            if (n > 0) {
                head.next = null;
            }
            return;
        }

        while (n >= 0) {
            q = q.getNext();
            n--;
        }

        while (q != null) {
            p = p.getNext();
            q = q.getNext();
        }

        p.setNext(p.getNext().getNext());
    }
}

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};

        LinkListFEL lfel = new LinkListFEL();
        lfel.createLinkListFEL(values);
        lfel.display();
        lfel.removeNthFromEnd(1);
        lfel.display();
    }
}

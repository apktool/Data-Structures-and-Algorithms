package leetcode.medium;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author apktool
 * @date 2018-06-10 22:02
 * *
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Note:
 *
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */

@RequiredArgsConstructor
class NodeSNP {
    @NonNull
    int val;
    NodeSNP next;
}

class LinkListSNP {
    transient NodeSNP head;

    public void createLinkList(int[] vals) {
        if (vals.length == 0) {
            return;
        }

        head = buildLinkList(vals);
    }

    private NodeSNP buildLinkList(int[] vals) {
        head = new NodeSNP(-1);
        NodeSNP p = head;
        for (int i = 0; i < vals.length; i++) {
            NodeSNP q = new NodeSNP(vals[i]);
            p.next = q;
            p = p.next;
        }

        return head;
    }

    /*
    1->2->3->4   ===   2->1->4->3
     */

    public void swapListNode() {
        NodeSNP pre = head;
        NodeSNP p = pre.next;

        while (p != null && p.next != null) {
            NodeSNP q = p.next;
            p.next = q.next;
            q.next = p;
            pre.next = q;
            pre = p;
            p = p.next;
        }
    }

    public void display() {
        NodeSNP p = head.next;

        while (p != null) {
            System.out.print(p.val);
            p = p.next;
        }
    }
}

public class SwapNodesinPairs {
    public static void main(String[] args) {
        int[] vals = {1, 2, 3, 4};
        LinkListSNP list = new LinkListSNP();
        list.createLinkList(vals);
        list.swapListNode();
        list.display();
    }
}

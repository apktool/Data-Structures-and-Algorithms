package leetcode.easy;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;


/**
 * @author apktool
 * @date 2018-05-01 17:18
 * *
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 * *
 * 注意此题存在一个坑点：
 * 循环不一定从head开始，可能会在尾部的某几个节点之间循环。
 */

@Data
class ListNodeC {
    @NonNull
    int val;
    ListNodeC next;
}

class LinkListC {
    @Getter
    transient ListNodeC head;

    public void buildLinkList(int[] vals) {
        head = createBuildLinkList(new ListNodeC(-1), vals);
    }

    public ListNodeC createBuildLinkList(ListNodeC head, int[] vals) {
        ListNodeC p = head;
        for (int val : vals) {
            ListNodeC q = new ListNodeC(val);
            p.setNext(q);
            p = q;
        }

        p.setNext(head);

        return head;
    }

    public void display(ListNodeC head) {
        ListNodeC p = head;

        while (p.getNext()!= head) {
            p = p.getNext();
            System.out.printf("%d ", p.getVal());
        }
        System.out.println();
    }

    public boolean hasCycle(ListNodeC head) {
        if (head == null) {
            return false;
        }

        ListNodeC pre = head;
        ListNodeC p = pre;

        while (p.getNext() != null && p.getNext()!= head) {
            p = p.getNext();

            pre.setNext(head);
            pre = p;
        }

        return p.getNext() == head;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        int[] vals = {1, 2, 3, 4};

        LinkListC linkList = new LinkListC();
        linkList.buildLinkList(vals);
        linkList.display(linkList.getHead());

        boolean flag = linkList.hasCycle(linkList.getHead());
        System.out.println(flag);
    }
}

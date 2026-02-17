package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MeioDaListaLigada {

    public ListNode middleNodeOne(ListNode head) {

        List<ListNode> array = new ArrayList<>();

        int length = 0;

        while (head != null) {
            array.add(head);
            head = head.next;
            length++;
        }

        return array.get(length / 2);

    }

    public ListNode middleNodeTwo(ListNode head) {

        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }
}

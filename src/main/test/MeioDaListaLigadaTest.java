package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MeioDaListaLigadaTest {

    @Test
    void meioDaListaLigada() {

        MeioDaListaLigada meioDaListaLigada = new MeioDaListaLigada();

        //list node com valores [1,2,3,4,5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        meioDaListaLigada.middleNodeOne(head);

        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);

        meioDaListaLigada.middleNodeTwo(head);

        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        meioDaListaLigada.middleNodeTwo(head);

    }
}

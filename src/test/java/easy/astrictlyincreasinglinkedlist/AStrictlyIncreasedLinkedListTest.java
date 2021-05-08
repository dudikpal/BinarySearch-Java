package easy.astrictlyincreasinglinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AStrictlyIncreasedLinkedListTest {

    @Test
    void testTrue() {

        LLNode node1 = new LLNode();
        LLNode node2 = new LLNode();
        LLNode node3 = new LLNode();
        LLNode node4 = new LLNode();
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node1.val = 1;
        node2.val = 5;
        node3.val = 8;
        node4.val = 9;

        assertTrue(new AStrictlyIncreasedLinkedList().solve(node1));
    }

    @Test
    void testFalse() {

        LLNode node1 = new LLNode();
        LLNode node2 = new LLNode();
        LLNode node3 = new LLNode();
        LLNode node4 = new LLNode();
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node1.val = 1;
        node2.val = 5;
        node3.val = 9;
        node4.val = 9;

        assertFalse(new AStrictlyIncreasedLinkedList().solve(node1));
    }

}
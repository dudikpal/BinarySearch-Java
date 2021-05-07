package easy.lengthofalinkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LengthOfALinkedListTest {

    @Test
    void test() {

        LLNode node1 = new LLNode();
        LLNode node2 = new LLNode();
        LLNode node3 = new LLNode();
        node1.next = node2;
        node2.next = node3;
        int expected = 3;

        assertEquals(expected ,new LengthOfALinkedList().solve(node1));
    }

}
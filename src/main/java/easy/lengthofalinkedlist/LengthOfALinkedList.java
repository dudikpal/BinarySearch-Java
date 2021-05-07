package easy.lengthofalinkedlist;



public class LengthOfALinkedList {

    public int solve(LLNode node) {

        if (node == null) {
            return 0;
        }
        int counter = 1;
        while (node.next != null) {
            node = node.next;
            counter++;
        }
        return counter;
    }
}


class LLNode {
  int val;
  LLNode next;
}

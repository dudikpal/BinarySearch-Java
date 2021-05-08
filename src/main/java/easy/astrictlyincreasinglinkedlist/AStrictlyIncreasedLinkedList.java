package easy.astrictlyincreasinglinkedlist;

public class AStrictlyIncreasedLinkedList {

    public boolean solve(LLNode head) {

        if (head == null) {
            return false;
        }
        int prev;
        while (head.next != null) {
            prev = head.val;
            head = head.next;
            if (head.val - prev < 1) {
                return false;
            }
        }
        return true;
    }

}

class LLNode {
  int val;
  LLNode next;
}

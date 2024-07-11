public class RemoveLoopFromLinkedList {

    static class Node{
        int head;
        Node next;
        public Node(int head, Node next) {
            this.head = head;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1,new Node(3, new Node(4, null)));
    }
}

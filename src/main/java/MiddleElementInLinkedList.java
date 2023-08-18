public class MiddleElementInLinkedList {

    static class Node{
        int data;
        Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public int middleElement(Node root){
        Node head= root;
        Node tail = root;
        while(tail.next != null){
            head = head.next;
            tail = tail.next;
            tail = tail.next !=null? tail.next : tail;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, null))))));
        MiddleElementInLinkedList middleElementInLinkedList = new MiddleElementInLinkedList();
        System.out.println(middleElementInLinkedList.middleElement(root));
    }
}

public class ReverseALinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node reverse(Node head){
        Node start = head;
        Node end = head.next;
        Node temp;
        while(end != null){
            temp = end.next;
            end.next = start;
            if(start==head){
                start.next = null;
            }
//            temp.next = end;
            start =end;
            end = temp;
        }
        return start;
    }
    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, null))))));
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();
        Node reverse = reverseALinkedList.reverse(head);
        while(reverse != null){
            System.out.print(reverse.data + " -> ");
            reverse = reverse.next;
        }
    }
}

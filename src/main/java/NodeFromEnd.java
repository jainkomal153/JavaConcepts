import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NodeFromEnd {
    static class Node
    {
        int data;
        Node next;
        Node(int d, Node next) {
            data = d;
            this.next = next;
        }
    }

    public int getNthNodeFromLast(Node head, int n){
        Node p = head;
        for(int i=1; i<n; i++){
            if(p.next != null){
                p = p.next;
            }else{
                return -1;
            }
        }
        while(p.next != null){
            head = head.next;
            p =p.next;
        }
        return head.data;
    }
    public static void main(String[] args) {
        Node list = new Node(1,
                new Node(2,
                        new Node(3,
                                new Node(4,
                                        new Node(5,
                                                new Node(6,
                                                        new Node(7,
                                                                new Node(8,
                                                                        new Node(9, null)))))))));
        NodeFromEnd nodeFromEnd = new NodeFromEnd();
        System.out.println(nodeFromEnd.getNthNodeFromLast(list,1));
    }
}

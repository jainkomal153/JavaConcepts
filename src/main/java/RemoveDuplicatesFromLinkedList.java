import java.util.HashSet;

public class RemoveDuplicatesFromLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public Node removeDuplicatesFromSortedLinkedList(Node head){
        Node left = head;
        Node right = head.next;

        while(right!=null){
            if(left.data==right.data){
                right = right.next;
                left.next = right;
            }else{
                left = left.next;
                right = right.next;
            }
        }
        return head;
    }

    public Node removeDuplicatesFromUnsortedLinkedList(Node head){
        Node left = head;
        Node right = head.next;
        HashSet<Integer> set = new HashSet<>();
        set.add(left.data);
        while(right!=null){
            if(!set.contains(right.data)){
                set.add(right.data);
                left = left.next;
                right = right.next;
            }else{
                right = right.next;
                left.next = right;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node sortedLinkedList= new Node(2, new Node(2, new Node(4, new Node(5, null))));
        Node unsortedLinkedList = new Node(5, new Node(2, new Node(4, new Node(2, null))));
        RemoveDuplicatesFromLinkedList removeDuplicatesFromLinkedList = new RemoveDuplicatesFromLinkedList();
        Node result = removeDuplicatesFromLinkedList.removeDuplicatesFromSortedLinkedList(sortedLinkedList);
        Node result1 = removeDuplicatesFromLinkedList.removeDuplicatesFromUnsortedLinkedList(unsortedLinkedList);

        while(result!=null){
            System.out.print(result.data + " -> ");
            result= result.next;
        }

        System.out.println("");
        while(result1!=null){
            System.out.print(result1.data + " -> ");
            result1= result1.next;
        }
    }
}

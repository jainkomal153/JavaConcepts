import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BSTChecker {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.data = value;
            this.left = left;
            this.right = right;
        }
    }
//    public boolean isBST(Node root) {
//        int keyNode = root.data;
//        ArrayList<Integer> leftNodes = new ArrayList<>();
//        ArrayList<Integer> righttNodes = new ArrayList<>();
//        if (root.left != null){
//            leftNodes = subTree(root.left, leftNodes);
//            if(Collections.max(leftNodes) > keyNode){
//                return false;
//            }
//        }
//        if (root.right != null){
//            righttNodes = subTree(root.right, righttNodes);
//            if(Collections.min(righttNodes) < keyNode){
//                return false;
//            }
//        }
//        return true;
//    }
//    public ArrayList<Integer> subTree(Node root, ArrayList<Integer> nodes){
//            nodes.add(root.data);
//            if(root.left != null){
//                subTree(root.left, nodes);
//            }
//            if(root.right != null) {
//                subTree(root.right, nodes);
//            }
//        return nodes;
//    }


    public boolean isBST(Node root){

        if(root.left != null){
            if(root.left.data >= root.data || isBST(root.left) == false){
                return false;
            }
        }
        if(root.right != null){
            if(root.right.data <= root.data || isBST(root.right) == false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Node root = new Node(10,
                new Node(5,
                        new Node(2, null, new Node(4, null, null)),
                        new Node(9,new Node(8, null, null),null)),
                new Node(18,
                        new Node(15,new Node(1, null,null), null),
                        new Node(19,null,null)));
//        10 5 18 2 9 15 19 N 4 8 N 1

//        Node root = new Node(1,
//                new Node(1, null,null),
//                new Node(6,null,null));
        BSTChecker bstChecker = new BSTChecker();
        System.out.println(bstChecker.isBST(root));
    }
}

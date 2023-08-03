import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

    static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public ArrayList<Integer> leftView (Node tree){
        return left(tree, new ArrayList<>());
    }

    public ArrayList<Integer> left(Node tree, ArrayList<Integer> leftView){
        if(tree == null){
            return leftView;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(tree);
        while(!queue.isEmpty()){
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                Node node =queue.poll();
                if (i == 1)
                    leftView.add(node.value);
                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
        }
        return leftView;
    }
    public static void main(String[] args) {
        Node tree = new Node(1,
                new Node(2,
                        new Node(4, null,
                                new Node(8,null,null)),
                        new Node(5, null, null)),
                new Node(3,
                        new Node(6, null, null),
                        new Node(7, null, null)));

//        Node tree = new Node(3,
//                new Node(4,
//                        new Node(4, null,
//                                new Node(8,null,null)),
//                        new Node(5, null, null)),
//                new Node(3,
//                        new Node(6, null, null),
//                        new Node(7, null, null)));
//        Node tree = new Node(10,
//                new Node(20,null, null),
////                        new Node(40, null,null),
////                        new Node(60, null, null)),
//                new Node(30, new Node(40, null, null), null));
//        Node tree = new Node(1, new Node(3, null, null), new Node(2, null, null));

//         3 4 N 2 7 N 2 1 N 9 1
        LeftViewOfBinaryTree leftViewOfBinaryTree = new LeftViewOfBinaryTree();
        ArrayList<Integer> leftView = leftViewOfBinaryTree.leftView(tree);
        System.out.println(leftView.toString());
    }
}

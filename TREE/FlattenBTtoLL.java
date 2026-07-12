package TREE;

public class FlattenBTtoLL {
      static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.right =this.left = null;
        }
      }

      static Node nextRight = null;

      public static void flatten(Node root){
        if( root == null){
            return;
        }

        flatten(root.right);
        flatten(root.left);

        root.right = nextRight;
        root.left = null;
        nextRight = root;
      }

      public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.right = new Node(6);

        flatten(root);

       Node curr = root;
       while (curr != null) {
        System.out.print(curr.data + " ");
        curr = curr.right;
    }
      }
    
}

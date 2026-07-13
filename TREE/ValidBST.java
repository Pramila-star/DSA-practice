package TREE;

public class ValidBST {
     static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.right =this.left = null;
        }
      }

      public static boolean isBST(Node root, Node min, Node max){
        if(root == null) return true;

        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }

        return isBST(root.left, min, root) && isBST(root.right, root, max);
      }

      public static void main(String args[]){
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(6);
        root.right.right = new Node(7);
        root.right.left = new Node(3);

        if (isBST(root, null, null)) {
        System.out.println("Valid BST");
    } else {
        System.out.println("Not a Valid BST");
      }
}
}

package TREE;

public class BuilsBSTpreorder {
     static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.right =this.left = null;
        }
      }
      static int i = 0;

      public static Node helper(int[] preorder, int bound){
        if(i == preorder.length || preorder[i] > bound){
            return null;
        }

        Node root = new Node(preorder[i++]);
        root.left = helper(preorder, root.data);
        root.right = helper(preorder, bound);

        return root;
      }

      public static Node bstPreorder(int[] preorder){
        return helper(preorder, Integer.MAX_VALUE);
      }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] preorder = {8, 5, 1, 7, 10, 12};

        Node root = bstPreorder(preorder);

        System.out.print("Preorder: ");
        preorder(root);

        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);
}
}
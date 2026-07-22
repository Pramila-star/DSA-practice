package TREE;

public class RecoverBST {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int data){
            this.val= data;
            this.left = this.right = null;
        }
    }
    static Node prev = null;
    static Node first = null;
    static Node sec = null;
    public static void inorder(Node root){
       if(root == null){
        return;
       }

       inorder(root.left);

       if(prev != null && prev.val > root.val){
          if(first == null){
            first =prev;
          }
          sec =root;
       }
       prev = root;

       inorder(root.right);
    }

    public static void RecoverBinST(Node root){
        inorder(root);

        int temp = first.val;
        first.val = sec.val;
        sec.val = temp;
    }

    public static void printInorder(Node root) {
    if (root == null) {
        return;
    }
    printInorder(root.left);
    System.out.print(root.val + " ");
    printInorder(root.right);
}

    public static void main(String args[]){
        Node root = new Node(3);
    root.left = new Node(1);
    root.right = new Node(4);
    root.right.left = new Node(2);

    System.out.println("Before Recovery:");
    printInorder(root);

    RecoverBinST(root);

    System.out.println("\nAfter Recovery:");
    printInorder(root);
    }
    
}

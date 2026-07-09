package TREE;
 
public class BtToSumT  {
      static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }

    static void preOrder(Node root){
        if(root == null){
          return;
        }

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static  int SumTree(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = SumTree(root.left);
        int rightSum = SumTree(root.right);

        root.data += leftSum +rightSum;

        return root.data;
    }
    
    public static void main(String args[]){
      Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);


        System.out.println("Before converting to Sum Tree:");
        preOrder(root);


        SumTree(root);


        System.out.println("\nAfter converting to Sum Tree:");
        preOrder(root);
    }
}

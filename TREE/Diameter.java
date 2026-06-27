package TREE;

public class Diameter {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }

        public static int diam(Node root){
            if(root == null) return 0;

            int leftDiam = diam(root.left);
            int rightDiam = diam(root.right);

            int currDiam = height(root.left) + height(root.right);

            return Math.max(currDiam, Math.max(leftDiam, rightDiam));
        }
        
        public static int height(Node root){
             if(root == null) return 0;

             int leftHeig = height(root.left);
             int rightHeig = height(root.right);

             int totalHeig = Math.max(leftHeig, rightHeig) + 1;

             return totalHeig;
        }

        public static void main(String args[]){
             Node root = new Node(1);

           root.left = new Node(2);
           root.right = new Node(3);

           root.left.left = new Node(4);
           root.left.right = new Node(5);

           root.right.right = new Node(6);
  
           System.out.println("Diameter = " + diam(root));
        }
    
}

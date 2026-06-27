package TREE;

public class OptimisedDiameter {
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }
    int ans = 0;
    int height(Node root){
        if(root == null) return  0;
        
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        ans = Math.max(ans,leftHt + rightHt); // current diameter of root node
        return Math.max(leftHt, rightHt) + 1;
    }

     int Diameter(Node root){
       height(root);

         return ans;
    }

    public static void main(String args[]){
         OptimisedDiameter tree = new OptimisedDiameter();

        Node root = tree.new Node(1);

        root.left = tree.new Node(2);
        root.right = tree.new Node(3);

        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        root.right.right = tree.new Node(6);

        System.out.println("Diameter = " + tree.Diameter(root));
    }
    
}

package TREE;

public class LCA {
    static class Node{
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }

    public static Node findLowCommAncestor(Node root, int p, int q){
        if(root == null){
            return null;
        }

        if (root.data == p || root.data == q)
            return root;

        Node leftLCA =  findLowCommAncestor(root.left, p , q);
        Node rightLCA =  findLowCommAncestor(root.right, p , q);

          if (leftLCA != null && rightLCA != null)
            return root;

        // only left side found
        if (leftLCA != null)
            return leftLCA;

        // only right side found
        return rightLCA;
    }

    public static void preOrder(Node root){
        if (root == null){
            return ;
        }

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
   
   static int idx = -1;
    public static Node buildTree(int[] nodes){
        idx++;

        if(nodes[idx] == -1) return null;

        Node root = new Node(nodes[idx]);
        root.left =buildTree(nodes);
        root.right = buildTree(nodes);

        return root;
    
}

public static void main(String args[]){
    int[] nodes = { 1,
                2,
                4,
                -1,
                -1,
                5,
                -1,
                -1,
                3,
                6,
                -1,
                -1,
                7,
                -1,
                -1
        };
    int p = 4;
    int q = 5;
     Node root = buildTree(nodes);
     Node lca = findLowCommAncestor(root, p, q);
     
     System.out.println("Lowset Common Ansector of " + p +" and " + q + " is :  " +  lca.data); 
     
}
}
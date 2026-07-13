package TREE;


public class MinDistBtwBSTnodes {
     static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.right =this.left = null;
        }
      }

       static Node prev = null;
      public static int minDiffInBST(Node root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }

        int ans = Integer.MAX_VALUE;
        if(root.left != null){
            int leftMin = minDiffInBST(root.left);
            ans = Math.min(ans, leftMin);
        }

        if(prev != null){
            ans = Math.min(ans, root.data - prev.data);
        }
            prev = root;

            if(root.right != null){
                int rightMin =  minDiffInBST(root.right);
                ans = Math.min(ans, rightMin);
            }
        return ans;
}

public static void main(String args[]){
    Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(6);
        root.right.right = new Node(7);
        root.right.left = new Node(3);
 
        int res = minDiffInBST(root);
        System.out.println(res);
}
}
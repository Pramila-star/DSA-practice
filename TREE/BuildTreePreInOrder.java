package TREE;

import java.util.HashMap;

public class BuildTreePreInOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }
      static int preIdx = 0;
      static HashMap<Integer, Integer> map = new HashMap<>();

    public static Node helper(int[] preorder, int left, int right){
        if(left > right){
            return null;
        }

        Node root = new Node(preorder[preIdx]);
        preIdx++;

        int inIdx = map.get(root.data);

        root.left = helper(preorder, left, inIdx -1);
        root.right = helper(preorder, inIdx+1, right);

        return root;

    } 

    public static Node buildTree(int[] preorder, int[] inorder){
        for(int i = 0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return helper(preorder, 0, inorder.length - 1);
    }

    public static void main(String args[]){
        int[] preorder = {3,9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Node root = buildTree(preorder, inorder);
        System.out.println("Preorder traversal of constructed tree:");
        printPreorder(root);
}

    public static void printPreorder(Node root) {
       if (root == null) {
        return;
    }

       System.out.print(root.data + " ");
       printPreorder(root.left);
       printPreorder(root.right);
}
}
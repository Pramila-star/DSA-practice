package TREE;

public class SortedArrayToBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.right =this.left = null;
        }
      }

      public static Node helper(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        Node root = new Node(nums[mid]);
        root.left = helper(nums, start, mid-1);
        root.right = helper(nums, mid+1, end);

        return root;
      }

       public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
         System.out.print(root.data + " ");
        inorder(root.right);
    }

      public static void main(String args[]){
        int[] nums = {-10, -3, 0, 5, 9};
        Node root = helper(nums, 0, nums.length-1);
        System.out.println("inorder Traversal of BST:");
        inorder(root);
       
      }
}

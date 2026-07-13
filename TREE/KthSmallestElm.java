package TREE;

public class KthSmallestElm {
    static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.right =this.left = null;
        }
      }

      static int prevOrder = 0;
      public static int kthSmallest(Node root, int k){
        if(root == null){
            return -1;
        }

        if(root.left != null){
            int leftAns = kthSmallest(root.left, k);
            if(leftAns != -1){
                return leftAns;
            }
        }
        if(prevOrder + 1 == k){
            return root.data;
        }
        prevOrder += 1;

        if(root.right != null){
            int rightAns = kthSmallest(root.right,k);
            if(rightAns != -1){
               return rightAns;
            }

}     
return -1;
   }

   public static void main(String args[]){
     Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(6);
        root.right.right = new Node(7);
        root.right.left = new Node(3);

        int res = kthSmallest(root, 4);
        System.out.println(res);
   }
      }



package TREE;

public class HeightOfTree {

    class Node {
        int data;
        Node left;
        Node right;

        public  Node(int value){
            this.data = value;
            this.left = this.right = null;
        }
    }

    public  Node buildTree(int[] arr, int index){
         if (index >= arr.length){
            return null;
         }

         Node root = new Node(arr[index]);

         root.left = buildTree(arr, 2 * index + 1);
         root.right = buildTree(arr, 2 * index + 2);

         return root;

    }

    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        return Math.max(leftHt , rightHt) + 1;
    }
    
    public static void main(String args[]){
        int[] arr = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        HeightOfTree tree = new HeightOfTree();
        Node root = tree.buildTree(arr, 0);

        System.out.println("height: " + height(root));
    }
}

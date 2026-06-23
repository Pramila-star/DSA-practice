package TREE;

public class countNodes{

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int value){
            this.data =value;
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

    public static int count(Node root){
        if (root == null){
            return 0;
        }

        int leftCnt = count(root.left);
        int rightCnt = count(root.right);

        return leftCnt + rightCnt + 1;
    }

    public static int sum(Node root){
        if (root == null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;

    }

    public static void main(String args[]){
        int[] arr = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        countNodes tree = new countNodes();
        Node root = tree.buildTree(arr, 0);
        System.out.println("sum: " + sum(root));
        System.out.println("Count of nodes:  " + count(root));
         
    }

}
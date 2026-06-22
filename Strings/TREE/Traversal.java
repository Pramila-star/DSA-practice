package TREE;

import java.util.LinkedList;
import java.util.Queue;  

class Traversal{
  
    class Node{
        int data;
        Node left;
        Node right;

        public  Node (int value){
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

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + "");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if (root == null){
            return;
        }

        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if (root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    // level order traversal
    public static void levelorder(Node root){
        if (root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            Node current  = queue.poll();
            System.out.println(current.data + " ");

            if (current.left != null){
                queue.offer(current.left);
            }

            if (current.right != null){
                queue.offer(current.right);
            }
        }
    }

    public static void main(String args[]){
        int[] arr = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        Traversal tree = new Traversal();
        Node root = tree.buildTree(arr, 0);
        System.out.println("Preorder Traversal: ");
        preorder(root);
    }
}
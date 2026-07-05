package TREE;

public class KthLevel {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }

    public static void Kthlevel(Node root, int k){
        if (root == null){
            return ;
        }

        if ( k==1){
            System.out.print(root.data + " ");
            return ;
        }
         Kthlevel(root.left, k-1);
         Kthlevel(root.right, k-1);
    }

    public static void preOrder(Node node){
        if (node== null){
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    static int idx = -1;
    static Node buildTree(int[] nodes) {
        idx++;

        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static void main(String args[]){
          int[] nodes = {
            1,
            2,
            4, -1, -1,
            5, -1, -1,
            3, -1,
            6, -1, -1
        };

        Node root = buildTree(nodes);
        int k = 3;

        System.out.println("Nodes at Level " + k + ": ");
        Kthlevel(root, k);
    }
}

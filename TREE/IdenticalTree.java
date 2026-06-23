package TREE;

public class IdenticalTree {

     static class Node{
        int data;
        Node left;
        Node right;

        public Node(int value){
             this.data = value;
             this.left =this.right = null;
        }
    }

    public static boolean isIdentical(Node p, Node q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.data != q.data) return false;

        boolean isLeftSame = isIdentical(p.left, q.left);
        boolean isRightSame = isIdentical(p.right, q.right);

        return isLeftSame && isRightSame;
    }

    public static void main(String args[]){
        
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);

        System.out.println(isIdentical(p, q));
    }
    
}

package TREE;

public class SubtreeOfAnotherTreeOrNot {

    static class Node{
        int data ;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }

    public static boolean isSubtree(Node root, Node subRoot){
       if(root == null || subRoot == null){
        return false;
       }

        if (root.data == subRoot.data && isIdentical(root,subRoot)){
            return true;
        }
        boolean leftSubTree = isSubtree(root.left, subRoot);
        boolean rightSubTree = isSubtree(root.right, subRoot);

        return leftSubTree || rightSubTree;

    }

    public static boolean isIdentical(Node p, Node q){
        if ( p== null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }

        if (p.data == q.data){
            return true;
        }

        boolean isLeftSame = isIdentical(p.left, q.left);
        boolean isrightSame = isIdentical(p.right, q.right);

        return isLeftSame && isrightSame;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        Node subRoot = new Node(3);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
    
}

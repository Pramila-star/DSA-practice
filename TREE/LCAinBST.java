package TREE;

public class LCAinBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.right =this.left = null;
        }
      }
public static Node LCAbst(Node root, Node p, Node q){
    if(root == null){
        return null;
    }
    if(root.data > p.data && root.data  > q.data){
        return LCAbst(root.left, p , q);
    }

    else if(root.data < p.data && root.data < q.data){
        return LCAbst(root.right, p , q);
    }
    else {
        return root;
    }
}

public static void main(String args[]){
    Node root = new Node(6);
    root.left = new Node(2);
    root.left.left = new Node(0);
    root.left.right = new Node(4);
    root.left.right.left = new Node(3);
   root.left.right.right = new Node(5); 
    root.right = new Node(8);
    root.right.left = new Node(7);
    root.right.right = new Node(9);
   
   Node p =root.left,left;
   Node q = root.left.right.right;
    Node ans = LCAbst(root, p, q);
    if(ans != null){
        System.out.println("LCA of " + p.data + " and " + q.data + " is: " + ans.data);
    } else {
        System.out.println("LCA is not found");
    }


}
    
}

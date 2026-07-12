package TREE;

import java.util.ArrayList;
import java.util.List;

public class MorrisInorderTraversal {

    static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }
    public static List<Integer> inorderTraversal(Node root){
        List<Integer> ans = new ArrayList<>();

        Node curr = root;

        while(curr != null){
            if(curr.left == null){
                ans.add(curr.data);
                curr = curr.right;
            }
            else {
                Node IP = curr.left;
                while(IP.right != null && IP.right != curr){
                    IP = IP.right;
                }

                if(IP.right == null){
                    IP.right = curr;
                    curr = curr.left;
                }  else {
                    IP.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        List<Integer> res = inorderTraversal(root);
        System.out.println(res);
    }
    
}

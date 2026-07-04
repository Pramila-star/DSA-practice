package TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfBT {

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int value){
            this.data = value;
            this.left = this.right = null;
        }
    }
    public static ArrayList<Integer> topView(Node root){
       ArrayList<Integer> ans = new ArrayList<>();

       if (root == null){
        return ans;
       }

       Queue<Node> q = new LinkedList<>(); 
       q.offer(root);

       while(!q.isEmpty()){
          Node curr = q.poll();
          ans.add(curr.data);

          if(curr.left != null){
            q.offer(curr.left);
          }

          if(curr.right != null){
            q.offer(curr.right);
          }
        
       }
       return ans;
    }
    
}

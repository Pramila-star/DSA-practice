package TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BTLevelOrder {
     static class Node {
        int data;
        Node left;
        Node right;

        public  Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }

    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
             int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Node curr = q.poll();
                level.add(curr.data);

                if (curr.left != null)
                    q.offer(curr.left);

                if (curr.right != null)
                    q.offer(curr.right);
            }

            ans.add(level);
        }

        return ans;
        }

        public static void main(String[] args) {

          Node root = new Node(3);

           root.left = new Node(9);
           root.right = new Node(20);

           root.right.left = new Node(15);
            root.right.right = new Node(7);

          List<List<Integer>> result = levelOrder(root);

          System.out.println(result);
    }
    }
    


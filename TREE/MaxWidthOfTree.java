package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfTree {
     static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }

    static class Pair{
        Node node;
        long index;

        public Pair(Node node, long index){
            this.node = node;
            this.index = index;
        }
    }

    public static int maxWidth(Node root){
        if(root == null){
            return 0;
        }

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int ans = 0;

        while(!q.isEmpty()){
            int size = q.size();
            long min = q.peek().index;

            long first = 0; 
            long last = 0;

            for(int i = 0; i < size; i++){
                Pair curr = q.poll();
                long idx = curr.index - min;
                
                if(i == 0){
                    first = idx;  
                }
                if(i == size-1)
                   last = idx;
        
                if(curr.node.left != null)
                   q.offer(new Pair(curr.node.left, 2*idx+1));

                if(curr.node.right != null){
                    q.offer(new Pair(curr.node.right, 2*idx+2));
                }   

                
            }
            ans = Math.max(ans, (int)(last - first + 1));
            }
            return ans;
        }
    
        public static void main(String args[]){
            Node root = new Node(1);

            root.left = new Node(3);
            root.right = new Node(2);

            root.left.left = new Node(5);
            root.left.right = new Node(3);

            root.right.right = new Node(9);

           int result = maxWidth(root);

           System.out.println("Maximum Width = " + result);
        }
}


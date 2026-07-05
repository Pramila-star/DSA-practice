package TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBT {

   static class Node {
        int data;
        Node left;
        Node right;

        public Node(int value){
            this.data = value;
            this.left = this.right = null;
        }
    }

   static class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }

}
    public static ArrayList<Integer> topView(Node root){
       ArrayList<Integer> ans = new ArrayList<>();

       if (root == null){
        return ans;
       }

      TreeMap<Integer, Integer> map = new TreeMap<>();
       Queue<Pair> q = new LinkedList<>(); 
       q.offer(new Pair(root, 0));

       while(!q.isEmpty()){
          Pair curr = q.poll();
          Node node = curr.node;
         int hd = curr.hd;

           // Store only the first node for each HD
            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }

            if (node.left != null) {
                q.offer(new Pair(node.left, hd - 1));
            }

            if (node.right != null) {
                q.offer(new Pair(node.right, hd + 1));
            }
        }

        for (int value : map.values()) {
            ans.add(value);
        }

        return ans;
    }

     public static void main(String[] args) {
       Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.right = new Node(4);

        root.right.left = new Node(5);
        root.right.right = new Node(6);

        root.right.left.right = new Node(7);

        ArrayList<Integer> result = topView(root);

        System.out.println(result);
    }
}

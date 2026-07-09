package TREE;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
      static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = this.right = null;
        }
    }

    public static void allPaths(Node root, String path, List<String> ans){
        if(root.left == null && root.right == null){
            ans.add(path);
            return;
        }

        if(root.left != null){
            allPaths(root.left, path + "->" + String.valueOf(root.left.data),ans);
        }
        if(root.right != null){
             allPaths(root.right, path + "->" +String.valueOf(root.right.data),ans);
        }
    }

    public static List<String> BTPaths(Node root){
      List<String> ans = new ArrayList<>();

      if(root == null){
        return ans;
      }
      String path =  String.valueOf(root.data);

      allPaths(root, path, ans);
      return ans;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);

        List<String> paths = BTPaths(root);

        System.out.println(paths);
    }
    
}

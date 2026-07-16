package TREE;

import java.util.ArrayList;
import java.util.List;

public class Merge2BST {
     static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.right =this.left = null;
        }
      }
       static void inorder(Node root, List<Integer> list){
          if(root == null) return;

          inorder(root.left, list);
          list.add(root.data);
          inorder(root.right, list);
           
       }

       static List<Integer> mergeList(List<Integer> list1, List<Integer> list2){
        List<Integer> merge = new ArrayList<>();

        int i = 0, j = 0;

        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) <= list2.get(j)){
                merge.add(list1.get(i++));
            } else {
                merge.add(list2.get(j++));
            }
        }
        while(list1.size() > i){
            merge.add(list1.get(i++));
        }
        while(list2.size() > j){
            merge.add(list2.get(j++));
        }
        return merge;
       }

       static Node buildBST(List<Integer> list, int start, int end){
        if(start > end) return null;

        int mid = start + (end - start) /2;

        Node root = new Node(list.get(mid));

        root.left = buildBST(list, start, mid-1);
        root.right = buildBST(list, mid+1, end);

        return root;
       }

      
      public static Node merge(Node root1, Node root2){
           List<Integer> arr1 = new ArrayList<>();
           List<Integer> arr2 = new ArrayList<>();

           inorder(root1, arr2);
           inorder(root2, arr2);

           List<Integer> temp = mergeList(arr1, arr2);

           return buildBST(temp , 0 , temp.size() - 1);

      }

      static void printInorder(Node root){
        if(root == null){
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        // First BST
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // Second BST
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node mergedRoot = merge(root1, root2);

        System.out.print("Merged BST (Inorder): ");
        printInorder(mergedRoot);
    }
      }


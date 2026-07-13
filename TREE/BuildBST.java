package TREE;

public class BuildBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int val){
            this.data = val;
            this.right =this.left = null;
        }
      }
      static Node buildBST(int[] arr){
          Node root = null;

          for(int val : arr){
            root = insert(root, val);
          }
          return root;
      }

      public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }

        if(val < root.data){
            root.left = insert(root.left, val);
        }  else {
            root.right = insert(root.right, val);
        }

        return root;
      }

      static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "-> ");
        inorder(root.right);
      }

      static boolean search(Node root, int key){
          if(root == null){
            return false;
          }
          if(root.data == key){
            return true;
          }

          if(root.data > key){
            return search(root.left, key);
          }   else {
            return search(root.right, key);
          }
      }

      static Node getInorderSuccessor(Node root){
          while (root != null && root.left != null){
            root = root.left;
          }
          return root;
      }

      static Node delNode(Node root,int key){
        if(root == null){
            return null;
        }
        if (root.data > key){
            root.left = delNode(root.left, key);
        }
        else if (key > root.data){
            root.right = delNode(root.right, key);
        }
        else { // delete : root == key 
            // 0 child  & 1 child
             if(root.left == null){
                Node temp = root.right;
                return temp;
             }
             else if(root.right == null){
                Node temp = root.left;
                return temp;
             }  else {  // 2 children
                   Node IS = getInorderSuccessor(root.right);
                   root.data = IS.data;
                   root.right = delNode(root.right, IS.data);
             }
        }
        return root;
      }

      public static void main(String args[]){
         int[] arr = {3, 2, 1, 5, 6, 4};
        Node root =  buildBST(arr);
        System.out.println("before deletion");
        inorder(root);
        //System.out.println(search(root, 5));
        System.out.println();
       
        delNode(root, 5);
        System.out.println("after deletion");
        inorder(root);
        System.out.println();
       
      }
    
}

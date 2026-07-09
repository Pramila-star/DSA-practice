package TREE;

import java.util.HashMap;

public class BuildTreePreInOrder {
    static int preIdx = 0;
   static HashMap<Integer, Integer> map = new HashMap();

   public BuildTreePreInOrder() {
   }

   public static Node helper(int[] var0, int var1, int var2) {
      if (var1 > var2) {
         return null;
      } else {
         Node var3 = new Node(var0[preIdx]);
         ++preIdx;
         int var4 = (Integer)map.get(var3.data);
         var3.left = helper(var0, var1, var4 - 1);
         var3.right = helper(var0, var4 + 1, var2);
         return var3;
      }
   }

   public static Node buildTree(int[] var0, int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         map.put(var1[var2], var2);
      }

      return helper(var0, 0, var1.length - 1);
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{3, 9, 20, 15, 7};
      int[] var2 = new int[]{9, 3, 15, 20, 7};
      Node var3 = buildTree(var1, var2);
      System.out.println(var3);
   }

   static class Node {
      int data;
      Node left;
      Node right;

      public Node(int var1) {
         this.data = var1;
         this.left = this.right = null;
      }
   }
}



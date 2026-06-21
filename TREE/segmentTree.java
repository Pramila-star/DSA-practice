package TREE;

public class segmentTree {

    class Node {
        private int value;
        private int startinterval;
        private int endinterval;
        private Node left;
        private Node right;

        public Node(int startinterval, int endinterval){
            this.startinterval = startinterval;
            this.endinterval = endinterval;
        }

    }
    private Node root;

    public segmentTree(int[] arr){
        // create a tree using this array

        this.root = constructTree(arr, 0 , arr.length -1 );
    }

    private  Node constructTree(int[] arr, int start, int end){
        if(start == end){
            // leaf node
            Node leaf = new Node(start, end);
            leaf.value = arr[start];
            return leaf;
        }

        // create new node with index you are at
        Node node =new Node(start, end);
        int mid = start + (end - start) / 2;
        
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        node.value = node.left.value + node.right.value;
        return node;
    }

    public void display()
{
    display(this.root);
}

private void display(Node node) {
    String str = "";

    if (node.left != null) {
        str = str + " Interval=[" + node.left.startinterval + "-" + node.left.endinterval + "] and data: " + node.left.value + " =>";
    } else {
        str = str + "No left child";
    }

    // for current node
      str = str + " Interval=[" + node.startinterval + "-" + node.endinterval + "] and data: " + node.value + " =>";

      if (node.right != null) {
        str = str + " Interval=[" + node.right.startinterval + "-" + node.right.endinterval + "] and data: " + node.right.value + " =>";
    } else {
        str = str + "No right child";
    }
    
   System.out.println(str);

   // call recursion
   if(node.left != null){
    display(node.left);
   }

   if(node.right != null){
    display(node.right);
   }
}

public int query(int qsi, int qei){
    return this.query(this.root, qsi, qei);
}

private int query(Node node, int qsi, int qei){
    if (node.startinterval >= qsi && node.endinterval <= qei){
        // node is completely inside query
        return node.value;
    } else if (node.startinterval > qei || node.endinterval < qsi){
        // node is completely outside the query
        return 0;
    }  else {
        return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
   }
}


public void update(int index, int value){
    this.root.value = update(this.root, index, value); 
}

private int update(Node node,int index, int value){
    if(index >= node.startinterval && index <= node.endinterval){
        if(index == node.startinterval && index == node.endinterval){
            node.value = value;
            return node.value;
        } else {
            int leftAns = update(node.left, index, value);
            int rightAns = update(node.right, index, value);

            node.value = leftAns + rightAns;
            return node.value;
        }
    }

    return node.value;
}
    public static void main(String args[]){
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};

        segmentTree tree = new segmentTree(arr);
        System.out.println("Segment Tree Created Successfully");
    }

    
}

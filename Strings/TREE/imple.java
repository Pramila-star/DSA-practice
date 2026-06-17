package TREE;
import java.util.Scanner;

class imple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();
        tree.populate(sc);

        System.out.println("\nTree Structure:");
        tree.prettyDisplay();

        sc.close();
    }
}

class BinaryTree {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public BinaryTree() {
    }

    // Insert elements
    public void populate(Scanner sc) {
        System.out.print("Enter the root node value: ");
        int value = sc.nextInt();
        root = new Node(value);

        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {

        System.out.print("Do you want to enter left of " + node.value + "? (true/false): ");
        boolean left = sc.nextBoolean();

        if (left) {
            System.out.print("Enter value of left child of " + node.value + ": ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.print("Do you want to enter right of " + node.value + "? (true/false): ");
        boolean right = sc.nextBoolean();

        if (right) {
            System.out.print("Enter value of right child of " + node.value + ": ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    // Display tree
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    // Pretty display
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-------> " + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }
}
// Define a class for the binary tree node
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    // Inorder traversal function
    void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree
        inorderTraversal(node.left);

        // Visit the current node
        System.out.print(node.data + " ");

        // Traverse the right subtree
        inorderTraversal(node.right);
    }

    // Wrapper function to start traversal from the root
    void inorder() {
        inorderTraversal(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of binary tree is:");
        tree.inorder();
    }
}

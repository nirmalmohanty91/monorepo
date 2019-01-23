package MyPreparation.algorithms;

public class BalancedSearchTree {

  public static void main(String[] args) {
    BST bstOperations = new BST();
    // Insertion
    Node root = null;
    root = bstOperations.insert(root, 15);
    root = bstOperations.insert(root, 10);
    root = bstOperations.insert(root, 8);
    root = bstOperations.insert(root, 12);
    root = bstOperations.insert(root, 20);
    root = bstOperations.insert(root, 17);
    root = bstOperations.insert(root, 25);
    // Searching
    System.out.println(bstOperations.search(root, 100));
    // Finding the Min value in BST
    // root = bstOperations.findMin(root);
    // Deletion
    root = bstOperations.delete(root, 15);
  }
}

class BST {

  public Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else if (data <= root.data) {
      root.left = insert(root.left, data);
    } else if (data > root.data) {
      root.right = insert(root.right, data);
    }
    return root;
  }

  public boolean search(Node root, int data) {
    boolean found;
    if (root == null) {
      found = false;
    } else if (root.data == data) {
      found = true;
    } else if (data <= root.data) {
      found = search(root.left, data);
    } else {
      found = search(root.right, data);
    }
    return found;
  }

  public Node delete(Node root, int data) {
    if (root == null) {
      return root;
    } else if (data < root.data) {
      root.left = delete(root.left, data);
    } else if (data > root.data) {
      root.right = delete(root.right, data);
    } else {
      // We found the element
      // Case 1: No Child
      if (root.left == null && root.right == null) {
        root = null;
      }
      // Case 2: One Child
      else if (root.left == null) {
        root = root.right;
      } else if (root.right == null) {
        root = root.left;
      }
      // Case 3 : 2 Children
      else {
        Node temp = findMin(root.right);
        root.data = temp.data;
        root.right = delete(root.right, temp.data);
      }
    }

    return root;
  }

  public Node findMin(Node root) {

    if (root == null) {
      return root;
    } else if (root.left == null) {
      return root;
    } else {
      return findMin(root.left);
    }
  }
}

class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    left = right = null;
  }
}

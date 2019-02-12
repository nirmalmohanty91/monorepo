package MyPreparation.algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Balanced Binary Tree
 * Height of left and right tree differs at most by 1
 * O(logn)
 *
 *
 * Binary tree is a tree in which each node can have at most 2 children. Some restrictions to BT is
 * called Binary Search Tree. The rule is: BST is a BT in which for each node value of all the nodes
 * in the left sub-tree is lesser or equal and value of all the nodes in the right sub-tree is
 * greater.
 * ###############################
 *
 * Binary Tree Traversal:
 *  1. Breadth-First:
 *     A. Level-Order
 *  2. Depth-First
 *     A. PreOrder[root ->left-subtree -> right-subtree]
 *     B. InOrder[left-subtree -> root -> right-subtree]
 *     C. PostOrder[left-subtree -> right-subtree -> root]
 */
public class BinarySearchTree {

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
    //System.out.println(bstOperations.search(root, 100));
    // Finding the Min value in BST
    // root = bstOperations.findMin(root);
    // Deletion
    root = bstOperations.delete(root, 15);

    // Check if BST
    System.out.println(bstOperations.checkIfBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    // Depth-first: PreOrder Traversal of tree
    System.out.println("Pre-Order:");
    bstOperations.preOrder(root);
    System.out.println("\nIn-order:");
    bstOperations.inOrder(root);
    System.out.println("\nPost-order:");
    bstOperations.postOrder(root);
    System.out.println("\nlevel-order:");
    bstOperations.levelOrder(root);
    System.out.println("\n Number of leaf nodes: "+bstOperations.countLeafNodes(root));
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

  public Node search(Node root, int data) {
    // Root is null or Supplied element is at root node return root
    if (root == null || root.data == data) {
      return root;
    }
    // If supplied element is less that the root element go left
    if (data <= root.data) {
      return search(root.left, data);
    }
    // Else search in right half of it
    return search(root.right, data);
  }

  public boolean checkIfBST(Node root, int min, int max) {
    if (root == null) {
      return true;
    }

    if (root.data <= min || root.data > max) {
      return false;
    }

    return checkIfBST(root.left, min, root.data) && checkIfBST(root.right, root.data, max);
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

  // Tree Traversal : Depth- first
  // PreOrder[root -> left-subtree -> right-subtree]
  public void preOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }
  // InOrder
  // InOrder[left-subtree -> root -> right-subtree]
  public void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }
  // PostOrder
  // PostOrder[left-subtree -> right-subtree -> root]
  public void postOrder(Node root) {
    if (root == null) {
      return;
    }
    postOrder(root.left);
    preOrder(root.right);
    System.out.print(root.data + " ");
  }

  public int countLeafNodes(Node root){
    LinkedList<Node> queue = new LinkedList<>();
    int count =0;
    queue.offerFirst(root);
    while (!queue.isEmpty()){
      Node temp = queue.pollLast();

      if(temp.left !=null){
        queue.offerFirst(temp.left);
      }

      if(temp.right !=null){
        queue.offerFirst(temp.right);
      }

      if(temp.left == null && temp.right ==null){
        count++;
      }

    }
   return count;

  }

  // Tree Traversal : Breadth - first
  public void levelOrder(Node root) {
    if (root == null) {
      return;
    }
    LinkedList<Node> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      // To retrieve & remove the element first pushed to queue
      Node current = queue.pollLast();
      System.out.print(current.data + " ");
      if (current.left != null) {
        queue.offer(current.left);
      }
      if (current.right != null) {
        queue.offer(current.right);
      }
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

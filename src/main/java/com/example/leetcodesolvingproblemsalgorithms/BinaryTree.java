//package com.example.leetcodesolvingproblemsalgorithms;
//
//import java.util.ArrayList;
//import java.util.List;
//
///** Class implementation of a binary tree , containing helper classes and methods. */
//public class BinaryTree {
//    private Node root;
//    private List<Integer> nodes = new ArrayList<>();
//    /** Constructor initializing the root node of the tree. */
//    public BinaryTree() {
//        root = null;
//    }
//
//    public Node getRoot() {
//        return root;
//    }
//
//    private Node insertNode(Node node, int dataBeingInserted) {
//        if (node == null) {
//            node = new Node(dataBeingInserted);
//            return node;
//        }
//        if (node.getData() > dataBeingInserted) {
//            insertNode(node.getLeft(), dataBeingInserted);
//        } else if (node.getData() < dataBeingInserted) {
//            insertNode(node.getRight(), dataBeingInserted);
//        }
//        return node;
//    }
//
//    /**
//     * Method that inserts nodes into the binary tree. If the tree is empty , a new root node is
//     * initialized.
//     *
//     * @param dataBeingInserted The number to be inserted as an integer.
//     */
//    public void insertNode(int dataBeingInserted) {
//        root = insertNode(root, dataBeingInserted);
//    }
//
//    private Node searchTree(Node node, int dataBeingSearched) {
//        if (node == null || node.getData() == dataBeingSearched) {
//            return node;
//        }
//        if (node.getData() > dataBeingSearched) {
//            return searchTree(node.getLeft(), dataBeingSearched);
//        }
//        return searchTree(node.getRight(), dataBeingSearched);
//    }
//    /**
//     * Method that recursively searches for our element through the tree. If the value is present in
//     * the root node , or there aren't any nodes in the tree , the method returns the root node. If
//     * the value we're looking for is smaller than the root node's value , we search for our value in
//     * the left subtree , otherwise we search for it in the right subtree.
//     *
//     * @param dataBeingSearched User's value.
//     * @return Recursive call of the method.
//     */
//    public Node searchTree(int dataBeingSearched) {
//        return searchTree(root, dataBeingSearched);
//    }
//
//    private String inorderTraversal(Node node) {
//        if (node == null) {
//            return "";
//        }
//        inorderTraversal(node.getLeft());
//        nodes.add(node.getData());
//        inorderTraversal(node.getRight());
//        return nodes.toString();
//    }
//
//    /**
//     * An implementation of the In-order traversal. First the left subtree is visited and printed
//     * accordingly, then we visit and print the root and after that we visit and print the right
//     * subtree.
//     */
//    public String inorderTraversal() {
//        return inorderTraversal(root);
//    }
//}
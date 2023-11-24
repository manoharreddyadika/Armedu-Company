package com.example.armedu.binarysearchtree;

class Node {
 int data;
 Node left, right;

 public Node(int item) {
     data = item;
     left = right = null;
 }
}

class BSTree {
 Node root;

 BSTree() {
     root = null;
 }

 void insert(int data) {
     root = insertRec(root, data);
 }

 Node insertRec(Node root, int data) {
    
     if (root == null) {
         root = new Node(data);
         return root;
     }

   
     if (data < root.data) {
  
         root.left = insertRec(root.left, data);
     } else if (data > root.data) {
  
         root.right = insertRec(root.right, data);
     }

     return root;
 }

 void inorderTraversal(Node root) {
     if (root != null) {
         inorderTraversal(root.left);
         System.out.println(root.data);
         inorderTraversal(root.right);
     }
 }
}

public class BinarySearch {
 public static void main(String[] args) {
    
     BSTree tree = new BSTree();

     int[] nodes = {5, 3, 8, 2, 4, 11};
     for (int nodeData : nodes) {
         tree.insert(nodeData);
     }

     tree.inorderTraversal(tree.root);
 }
}

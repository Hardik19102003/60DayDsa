//package com.DSA.LAB11;
//
//class Node{
//    int key;
//    Node left;
//    Node right;
//    int height;
//
//    Node(int d){
//        key = d;
//        height = 1;
//    }
//}
//
//public class AVL {
//
//    Node root ;
//
//    int getHeight(Node node){
//        if(node == null){
//            return 0;
//        }
//        return node.height;
//    }
//
//    Node creatNode(int key){
//        Node node = new Node(key);
//        node.left = null;
//        node.right = null;
//        node.height = 1;
//
//        return node;
//    }
//
//    int max(int a,int b){
//        return (a>b)? a:b;
//    }
//
//    int getBalanceFactor(Node node){
//        if(node == null){
//            return 0;
//        }
//
//        return getHeight(node.left) - getHeight(node.right);
//    }
//
//    Node rightRotate(Node y){
//        Node x = y.left;
//        Node T2 = x.right;
//
//        x.right = y;
//        y.left = T2;
//
//        x.height = max(getHeight(x.right),getHeight(x.left)) + 1;
//        y.height = max(getHeight(y.right),getHeight(y.left)) + 1;
//
//        return x;
//    }
//
//    Node leftRotate(Node x){
//        Node y = x.right;
//        Node T2 = y.left;
//
//        y.left = x;
//        x.right = T2;
//
//        x.height = max(getHeight(x.right),getHeight(x.left)) + 1;
//        y.height = max(getHeight(y.right),getHeight(y.left)) + 1;
//
//        return y;
//    }
//
//    Node insertNode(Node node,int key){
//        if(node == null){
//            return creatNode(key);
//        }
//
//        if(key<node.key){
//            node.left = insertNode(node.left,key);
//        }
//        else if(key>node.key){
//            node.right = insertNode(node.right,key);
//        }
//
//        node.height = 1 + max(getHeight(node.left),getHeight(node.right));
//
//        int bf = getBalanceFactor(node);
//
//       //left left Case
//        if(bf>1 && key<node.left.key){
//            return rightRotate(node);
//        }
//
////        Right right Case
//        if(bf<-1 && key>node.right.key){
//            return leftRotate(node);
//        }
//
//        //Left Right Case
//        if(bf>1 && key>node.left.key){
//            node.left = leftRotate(node.left);
//            return rightRotate(node);
//        }
//
//        //Right Left Case
//        if(bf<-1 && key<node.right.key){
//            node.right = rightRotate(node.right);
//            return leftRotate(node);
//        }
//
//        return node;
//    }
//
//    Node minValueNode(Node node)
//    {
//        Node temp;
//        for(temp=node;temp.left!=null;temp=temp.left);
//
//        return temp;
//    }
//
//    Node deleteNode(Node root, int key)
//    {
//        // STEP 1: PERFORM STANDARD BST DELETE
//        if (root == null)
//            return root;
//
//        // If the key is smaller than the root key,then it lies in left subtree
//
//        if (key < root.key)
//            root.left = deleteNode(root.left, key);
//
//        // If the key is greater than the root key,then it lies in right subtree
//        else if (key > root.key)
//            root.right = deleteNode(root.right, key);
//
//            // if key is same as root&#39;s key, then
//            // This is the node to be deleted
//        else
//        {
//            // node with only one child or no child
//            if ((root.left == null) || (root.right == null))
//            {
//                Node temp = null;
//                if (temp == root.left)
//                    temp = root.right;
//                else
//                    temp = root.left;
//
//                // No child case
//                if (temp == null)
//                {
//                    temp = root;
//                    root = null;
//                }
//                else // one child case
//                    root = temp;
//            }
//            else
//            {
//                // node with two children: Get the inorder
//                // successor (smallest in the right subtree)
//                Node temp = minValueNode(root.right);
//
//                // Copy the inorder successor&#39;s
//                // data to this node
//                root.key = temp.key;
//
//                // Delete the inorder successor
//                root.right = deleteNode(root.right, temp.key);
//            }
//        }
//
//        // If the tree had only one node
//        // then return
//        if (root == null)
//            return root;
//
//        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
//        root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
//
//        // STEP 3: GET THE BALANCE FACTOR OF
//        // THIS NODE (to check whether this
//        // node became unbalanced)
//        int balance = getBalanceFactor(root);
//
//        // If this node becomes unbalanced,
//        // then there are 4 cases
//
//        // Left Left Case
//        if (balance > 1 && getBalanceFactor(root.left) >= 0)
//            return rightRotate(root);
//
//        // Left Right Case
//        if (balance > 1 && getBalanceFactor(root.left) < 0)
//        {
//            root.left = leftRotate(root.left);
//            return rightRotate(root);
//        }
//
//        // Right Right Case
//        if (balance < -1 && getBalanceFactor(root.right) <= 0)
//            return leftRotate(root);
//
//        // Right Left Case
//        if (balance < -1 && getBalanceFactor(root.right) > 0)
//        {
//            root.right = rightRotate(root.right);
//            return leftRotate(root);
//        }
//
//        return root;
//    }
//
//    void inOrder(Node root){
//        if(root != null){
//            inOrder(root.left);
//            System.out.print(root.key + " ");
//            inOrder(root.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        AVL avl = new AVL();
//        avl.root = avl.insertNode(avl.root,8);
//        avl.root = avl.insertNode(avl.root,12);
//        avl.root = avl.insertNode(avl.root,5);
//        avl.root = avl.insertNode(avl.root,2);
//        avl.root = avl.insertNode(avl.root,4);
//        avl.root = avl.insertNode(avl.root,11);
//        avl.root = avl.insertNode(avl.root,1);
//        avl.root = avl.insertNode(avl.root,9);
//        avl.root = avl.insertNode(avl.root,6);
//
//        System.out.println("In order Traversal : ");
//        avl.inOrder(avl.root);
//
//        avl.deleteNode(avl.root,2);
//        System.out.println("\n \nIn order Traversal after delete 2 : ");
//        avl.inOrder(avl.root);
//
//        avl.deleteNode(avl.root,11);
//        System.out.println("\n \nIn order Traversal after delete 11 : ");
//        avl.inOrder(avl.root);
//    }
//}

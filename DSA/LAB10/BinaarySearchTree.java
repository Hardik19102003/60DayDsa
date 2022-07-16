package com.DSA.LAB10;

class BinarySearchTree {

    //IN binary tree we have root, left child, right child and key(value)
    Node root;

    class Node {
        int key;
        Node left, right;

        public Node(int value)
        {
            key = value;
            left = right = null;
        }
    }

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int value) { root = new Node(value); }

    // This method mainly calls insertRec()
    void insert(int key) { root = insert(root, key); }

    /* A recursive function to
    insert a new key in BST */
    Node insert(Node root, int key)
    {
        // tree is empty  return root
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // compare key value with root value and according to that go right or left in tree
        if (key < root.key){
            root.left = insert(root.left, key);
        }
        else if (key > root.key){
            root.right = insert(root.right, key);
        }


        return root;
    }

    // A utility function to
    // do inorder traversal of BST
    void inorder(Node root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }

    // search a given key in BST
    public Node search(Node root, int key)
    {
        // if root is null or key is present at root
        if (root==null || root.key==key)
            return root;

        // Key value is greater than root's key
        if (root.key < key)
            return search(root.right, key);

        // Key value is smaller than root's key
        return search(root.left, key);
    }

    //Deletion in BST
    int successor(Node root) {
        root = root.right;
        while (root.left != null){
            root = root.left;
        }
        return root.key;
    }
    int predecessor(Node root) {
        root = root.left;
        while (root.right != null) root = root.right;
        return root.key;
    }

    Node delete(Node root, int key) {
        if (root == null){
            return null;
        }
        if (key > root.key){
            root.right = delete(root.right, key);
        }
        else if (key < root.key) {
            root.left = delete(root.left, key);
        }
        else {
            if (root.left == null && root.right == null){
                root = null;
            }
            else if (root.right != null) {
                root.key = successor(root);
                root.right = delete(root.right, root.key);
            } else {
                root.key = predecessor(root);
                root.left = delete(root.left, root.key);
            }
        }
        return root;
    }

    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree(55);

//		BST
//			      7
//	        	/	\
//		     4	    10
//		    / \     / \
//	       2   6   8   55
//        / \ /
//       1  3 5
        tree.insert(Integer.parseInt("5"));
        tree.insert(1);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(10);
        tree.insert(6);
        tree.insert(8);

        // print inorder traversal of the BST
        System.out.println("Inserted elements in BST :");
        tree.inorder(tree.root);

        //delete 7
        System.out.println("After deletion in BST :");
        tree.delete(tree.root, 7);
        tree.delete(tree.root, 55);
        tree.delete(tree.root, 5);
        tree.delete(tree.root, 6);
        tree.inorder(tree.root);

        System.out.println("Searching deleted element");
        System.out.println(tree.search(tree.root, 7));
    }
}



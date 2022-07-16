package com.DSA.LAB10;

class Node
{
    int key;
    Node left, right;

    Node(int value)
    {
        key = value;
        left = right = null;

    }
}

class BinaryTree
{
    Node root;

    //  print reverse order
    void reverse(Node node)
    {
        int height = height(node);
        for (int i = height; i >= 1; i--)
        {
            printLevel(node, i);
        }
    }

//     Print nodes at a given level
    void printLevel(Node node, int level)
    {
        if (node == null){
            return;
        }
        if (level == 1){
            System.out.print(node.key + " ");
        }
        else if (level > 1)
        {
            printLevel(node.left, level - 1);
            printLevel(node.right, level - 1);
        }
    }

//  height of tree from top most(root node) to bottom most(leaf node)
    int height(Node node)
    {
        if (node == null){
            return 0;
        }
        else
        {
            // compute the height of each subtree
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

//             use the larger one
            if (leftHeight > rightHeight){
                return (leftHeight + 1);
            }
            else{
                return (rightHeight + 1);
            }
        }
    }

    void inorder(Node root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(7);
        tree.root.right.left = new Node(6);
        System.out.println("Binary Tree : ");
        tree.inorder(tree.root);

        System.out.println("\nLevel Order traversal of binary tree is : ");
        tree.reverse(tree.root);
    }
}


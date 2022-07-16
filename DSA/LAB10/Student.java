package com.DSA.LAB10;

public class Student {

    private static Node root = null;

    private class Node {
        String data;

        Node left;
        Node right;

        public Node(String name) {
            data = name;
            left = right = null;
        }
    }

    public static void main(String[] args) {

        //here sign is represent whether we are inserting on left or right in a tree
        // Insted of this we can use Scanner also
        Student student = new Student();
        System.out.println("Inserting students : ");
        student.insert("Hardik", "-");
        student.insert("Devansh", "+");
        student.insert("Rishita", "-+");
        student.insert("Medhavi", "+-");
        student.insert("Zeel", "++");
        student.inorder();
//        student.insert("7)Heni", "+++");
//        student.insert("8)Priya", "++-");
//        student.insert("9)Rishita", "+-+");
//        student.insert("10)Parth", "+--");
//        student.insert("11)Parthee", "-++");
//        student.insert("12)aman", "-+-");
//        student.insert("13)Zeel", "--+");
//        student.insert("14)Zeenal", "---");
//        student.insert("15)Urvi", "++++");
//        student.insert("16)Meghavi", "+++-");
//        student.insert("17)Smit", "++-+");
//        student.insert("18)Smruti", "++--");
//        student.insert("19)Samarth", "+--+");
//        student.insert("20)Krishna", "+---");

        System.out.println("\nRemoving Student(Hardik) : ");
        student.delete(root,"Hardik");
//        student.delete(root,"17)Smit");
//        student.delete(root,"19)Samarth");
        student.inorder();

        System.out.println("\nSearching for deleted student name (Hardik):");
        System.out.println(student.search(root,"Hardik"));
    }

    private void insert(String name, String sign) {
        root = insert(root, name, sign);
    }

    Node insert(Node root, String name, String sign) {
        // Check whether there is a sign
        if (sign.length() == 0) {
            return new Node(name);
        }
        // If needed, create a placeholder node so to be able to descend further
        if (root == null) {
            root = new Node("null");
        }

        if (sign.charAt(0) == '-') {
            // Extract the rest of the signs
            root.right = insert(root.right, name, sign.substring(1));
        }
        else {
            root.left = insert(root.left, name, sign.substring(1));
        }
        return root;
    }

    public void inorder() {
        inorder(root, "");
    }

    // This method gives a bit more visual output
    public void inorder(Node root, String indent) {
        if (root != null) {
            inorder(root.left, indent );
            System.out.println(indent + root.data);
            inorder(root.right, indent);
        }
    }


    // Deletion in Binary Search Tree
    private String minimum(Node root) {
        String name = root.data;
        while (root.left != null) {
            name = root.left.data;
            root = root.left;
        }
        return name;
    }

    private Node delete(Node root, String name){
        if(root == null){
            return root;
        } else if(root.data.compareTo(name) < 0){
            root.left = delete(root.left, name);
        } else if(root.data.compareTo(name) > 0){
            root.right = delete(root.right, name);
        } else {
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            root.data = minimum(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    //Search
    String search(Node root,String name) {
        // nothing to search, not found
        if (root==null) {
            return null;
        }

        // Found it!
        if (root.data == name){
            return name;
        }

        // This is when we recurse left, stop if we found a result
        String leftNode = search(root.left, name);
        if (leftNode!=null){
            return leftNode;
        }

        // else try to the right, stop if we found a result
        String rightNode = search(root.right, name);
        if (rightNode!=null){
            return rightNode;
        }

        // Nothing else to try, not found
        return "-1";
    }
}



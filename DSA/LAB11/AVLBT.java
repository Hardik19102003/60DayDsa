package com.DSA.LAB11;

class Node{
    String key1,key2;
    Node left;
    Node right;
    int height;

    Node(String d1,String d2){
        key1 = d1;
        key2 = d2;
        height = 1;
    }
}

public class AVLBT {
    Node root1;
    Node root2;

    int getHeight(Node node){
        if(node == null){
            return 0;
        }
        return node.height;
    }

    Node creatNode(String key1,String key2){
        Node node = new Node(key1,key2);
        node.key1 = key1;
        node.key2 = key2;
        node.left = null;
        node.right = null;
        node.height = 1;

        return node;
    }

    int max(int a,int b){
        return (a>b)? a:b;
    }

    int getBalanceFactor(Node node){
        if(node == null){
            return 0;
        }

        return getHeight(node.left) - getHeight(node.right);
    }

    Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        x.height = max(getHeight(x.right),getHeight(x.left)) + 1;
        y.height = max(getHeight(y.right),getHeight(y.left)) + 1;

        return x;
    }

    Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(getHeight(x.right),getHeight(x.left)) + 1;
        y.height = max(getHeight(y.right),getHeight(y.left)) + 1;

        return y;
    }

    Node insertNode(Node node,String key1,String key2){
        if(node == null){
            return creatNode(key1,key2);
        }

        if(key1.compareTo(node.key1)<0){
            node.left = insertNode(node.left,key1,key2);
        }
        else if(key1.compareTo(node.key1)>0){
            node.right = insertNode(node.right,key1,key2);
        }

        node.height = 1 + max(getHeight(node.left),getHeight(node.right));

        int bf = getBalanceFactor(node);

        //left left Case
        if(bf>1 && key1.compareTo(node.left.key1)<0){
            return rightRotate(node);
        }

//        Right right Case
        if(bf<-1 && key1.compareTo(node.right.key1)>0){
            return leftRotate(node);
        }

        //Left Right Case
        if(bf>1 && key1.compareTo(node.left.key1)>0){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        //Right Left Case
        if(bf<-1 && key1.compareTo(node.right.key1)<0){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    Node minValueNode(Node node)
    {
        Node temp;
        for(temp=node;temp.left!=null;temp=temp.left);

        return temp;
    }



    void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.key1 + " " + root.key2 + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        AVLBT avl = new AVLBT();
        avl.root1 = avl.insertNode(avl.root1,"Hardik","19102003");
        avl.root1 = avl.insertNode(avl.root1,"Devansh","19102000");
        avl.root1 = avl.insertNode(avl.root1,"Caption","20102002");
        avl.root1 = avl.insertNode(avl.root1,"zatch","11111999");

        System.out.println("In order Traversal 1: ");
        avl.inOrder(avl.root1);

        avl.root2 = avl.insertNode(avl.root2,"19102003","Hardik");
        avl.root2 = avl.insertNode(avl.root2,"11102004","Devansh");
        avl.root2 = avl.insertNode(avl.root2,"25012003","Raj");
        avl.root2 = avl.insertNode(avl.root2,"06072004","Jayesh");
        avl.root2 = avl.insertNode(avl.root2,"19102000","Rishita");

        System.out.println("\nIn order Traversal 2: ");
        avl.inOrder(avl.root2);
    }
}

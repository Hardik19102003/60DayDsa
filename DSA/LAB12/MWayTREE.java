package com.DSA.LAB12;

public class MWayTREE {

    private node root;

    public static void main(String[] args) {
        MWayTREE mvt = new MWayTREE();
         node root = null;
         int x = 0;
        mvt.root = mvt.insert(mvt.root, 40);
        mvt.root = mvt.insert(mvt.root, 20);
//        root = mvt.insert(root, 10);
//        root = mvt.insert(root, 25);
//        root = mvt.insert(root, 30);
//        root = mvt.insert(root, 22);
//        root = mvt.insert(root, 50);
        System.out.println(mvt.search(20,mvt.root,x));

    }

    int MAX = 2;
    int MIN = 0;
    public class node {
        int count;
        int[] value = new int[MAX + 1];
        node[] child = new node[MAX + 1];
    }

    // Sets the value in the node
    boolean setval(int val, node n, int p, node c)
    {
        int k = 0;

        // if node is null
        if (n == null) {
        p = val;
        c = null;
            return true;
        }
        else {

            // Checks whether the value to be
            // inserted is present or not
            if (searchnode(val, n, k))
            System.out.println("Key value already exists\n");

            // The if-else condition checks whether
            // the number of nodes is greater or less
            // than the maximum number. If it is less
            // then it inserts the new value in the
            // same level node, otherwise, it splits the
            // node and then inserts the value
            if (setval(val, n.child[k], p, c)) {

                // if the count is less than the max
                if (n.count < MAX) {
                    fillnode(p, c, n, k);
                    return false;
                }
                else {

                    // Insert by splitting
                    split(p, c, n, k, p, c);
                    return true;
                }
            }
            return false;
        }
    }


    // Adjusts the value of the node
    void fillnode(int val, node c, node n, int k)
    {
        int i;

        // Shifting the node by one position
        for (i = n.count; i > k; i--) {
            n.value[i + 1] = n.value[i];
            n.child[i + 1] = n.child[i];
        }
        n.value[k + 1] = val;
        n.child[k + 1] = c;
        n.count++;
    }

    // Splits the node
    void split(int val,node c,node n, int k, int y,node newnode)
    {
        int i, mid;
        if (k <= MIN)
            mid = MIN;
        else
            mid = MIN + 1;

        // Allocating the memory for a new node
    newnode = new node();

        for (i = mid + 1; i <= MAX; i++) {
            (newnode).value[i - mid] = n.value[i];
            (newnode).child[i - mid] = n.child[i];
        }

        (newnode).count = MAX - mid;
        n.count = mid;

        // it checks whether the new value
        // that is to be inserted is inserted
        // at a position less than or equal
        // to minimum values required in a node
        if (k <= MIN)
            fillnode(val, c, n, k);
        else
            fillnode(val, c, newnode, k - mid);

    y = n.value[n.count];
        (newnode).child[0] = n.child[n.count];
        n.count--;
    }

    // Inserts a value in the m-Way tree
    public node insert( node root,int val)
    {
        int i = 0;
        node c = null, n;
        boolean flag;

        // Function setval() is called which
        // returns a value 0 if the new value
        // is inserted in the tree, otherwise
        // it returns a value 1
        flag = setval(val, root, i, c);

        if (flag) {
            n = new node();
            n.count = 1;
            n.value[1] = i;
            n.child[0] = root;
            n.child[1] = c;
            return n;
        }
        return root;
    }

    // Searches value in the node
    public node search(int val, node root, int pos) {
        // if root is Null then return
        if (root == null)
            return null;
        else {
            // if node is found
            if (searchnode(val, root, pos))
                return root;

                // if not then search in child nodes
            else
                return search(val, root.child[pos], pos);
        }
    }

    // Searches the node
    public boolean searchnode(int val, node n, int pos) {
        // if val is less than node.value[1]
        if (val < n.value[1]) {
            pos = 0;
            return false;
        }
        // if the val is greater
        else {
            pos = n.count;

            // check in the child array
            // for correct position
            while ((val < n.value[pos]) && pos > 1)
                pos--;

            if (val == n.value[pos])
                return true;
            else
                return false;
        }
    }
}

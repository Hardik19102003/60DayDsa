//package com.DSA.LAB13;
//
//import java.util.*;
//
//// This class represents a directed graph using
//// adjacency list representation
//public class Graphs {
//    // No. of vertices in graph
//    private int v;
//
//    // adjacency list
//    private ArrayList<Integer>[] adjList;
//
//    // Constructor
//    public Graphs(int V)
//    {
//
//        // initialise vertex count
//        this.v = V;
//
//        // initialise adjacency list
//        initAdjList();
//    }
//
//    // utility method to initialise
//    // adjacency list
//    @SuppressWarnings("unchecked")
//    private void initAdjList()
//    {
//        adjList = new ArrayList[v];
//
//        for (int i = 0; i < v; i++) {
//            adjList[i] = new ArrayList<>();
//        }
//    }
//
//    // add edge from u to v
//    public void addEdge(int u, int v)
//    {
//        // Add v to u's list.
//        adjList[u].add(v);
//    }
//
//    // Prints all paths from
//    // 'source' to 'destination'
//    public void displayAllPaths(int source, int destination)
//    {
//        boolean[] checked = new boolean[v];
//        ArrayList<Integer> pathList = new ArrayList<>();
//
//        // add source to path[]
//        pathList.add(source);
//
//        // Call recursive utility
//        printAllPathsUtil(source, destination, checked, pathList);
//    }
//
//    // A recursive function to print
//    // all paths from 'u' to 'd'.
//    // isVisited[] keeps track of
//    // vertices in current path.
//    // localPathList<> stores actual
//    // vertices in the current path
//    private void printAllPathsUtil(Integer u, Integer d,boolean[] isVisited,List<Integer> localPathList)
//    {
//
//        if (u.equals(d)) {
//            System.out.println(localPathList);
//            // if match found then no need to traverse more till depth
//            return;
//        }
//
//        // Mark the current node
//        isVisited[u] = true;
//
//        // Recur for all the vertices
//        // adjacent to current vertex
//        for (Integer i : adjList[u]) {
//            if (!isVisited[i]) {
//                // store current node
//                // in path[]
//                localPathList.add(i);
//                printAllPathsUtil(i, d, isVisited, localPathList);
//
//                // remove current node
//                // in path[]
//                localPathList.remove(i);
//            }
//        }
//
//        // Mark the current node
//        isVisited[u] = false;
//    }
//
//    //Count the number of Paths from source to destination
//    // Returns count of
//    // paths from 'source' to 'destination'
//    int countPaths(int s, int d)
//    {
//
//        // Call the recursive method
//        // to count all paths
//        int pathCount = 0;
//        pathCount = countPathFromStoD(s, d, pathCount);
//        return pathCount;
//    }
//
//    // A recursive method to count
//    // all paths from 'u' to 'd'.
//    int countPathFromStoD(int u, int d, int pathCount)
//    {
//
//        // If current vertex is same as
//        // destination, then increment count
//        if (u == d) {
//            pathCount++;
//        }
//
//        // Recur for all the vertices
//        // adjacent to this vertex
//        else {
//            for (int n : adjList[u]) {
//                pathCount = countPathFromStoD(n, d, pathCount);
//            }
//        }
//        return pathCount;
//    }
//
//    public static void main(String[] args)
//    {
//        Graphs g = new Graphs(8);
//        g.addEdge(1,3);
//        g.addEdge(1,2);
//        g.addEdge(2,5);
//        g.addEdge(2,4);
//        g.addEdge(3,6);
//        g.addEdge(4,7);
//        g.addEdge(5,7);
//        g.addEdge(6,5);
//        g.addEdge(6,7);
//
//        // arbitrary source
//        int source = 1;
//
//        // arbitrary destination
//        int destination = 7;
//
//        System.out.println(g.countPaths(source, destination));
//        System.out.println(" Different paths from " + source + " to " + destination);
//        g.displayAllPaths(source, destination);
//    }
//}

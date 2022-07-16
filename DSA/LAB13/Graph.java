//package com.DSA.LAB13;
//
//import java.util.*;
//
//public class Graph {
//
//    // A utility function to add an edge in an
//    // undirected graph
//    static void addEdge(ArrayList<ArrayList<Integer> > adj,int u, int v)
//    {
//        adj.get(u).add(v);
//        adj.get(v).add(u);
//    }
//
//    // A utility function to print the adjacency list
//    // representation of graph
//    static void printGraph(ArrayList<ArrayList<Integer> > adj)
//    {
//        for (int i = 0; i < adj.size(); i++) {
//            System.out.println("\nAdjacency list of vertex" + i);
//            System.out.print("head");
//
//            for (int j = 0; j < adj.get(i).size(); j++) {
//                System.out.print(" -> " + adj.get(i).get(j));
//            }
//            System.out.println();
//        }
//    }
//
//
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//
//        // n is the number of vertices
//        // m is the number of edges
//        int n = in.nextInt();
//        int m = in.nextInt();
//        System.out.println();
//        System.out.println("Adjacency Matrix  : ");
//        int[][] adjMat = new int[n + 1][n + 1];
//        for(int i = 0; i < m; i++) {
//            int u = in.nextInt();
//            int v = in.nextInt();
//            adjMat[u][v] = 1;
//            adjMat[v][u] = 1;
//        }
//
//        System.out.println();
//        System.out.println("Adjacency List : ");
//        // Creating a graph with 5 vertices
//        int V = 5;
//        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V);
//
//        for (int i = 0; i < V; i++){
//            adj.add(new ArrayList<Integer>());
//        }
//
//        // Adding edges one by one
//        addEdge(adj, 0, 1);
//        addEdge(adj, 0, 4);
//        addEdge(adj, 1, 2);
//        addEdge(adj, 1, 3);
//        addEdge(adj, 1, 4);
//        addEdge(adj, 2, 3);
//        addEdge(adj, 3, 4);
//
//        printGraph(adj);
//    }
//}

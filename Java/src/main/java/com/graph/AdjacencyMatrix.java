package com.graph;

/**
 * @author apktool
 * @date 2018-05-31 22:13
 * *
 * 使用邻接矩阵创建图
 * * 无向图
 * * 有向图
 */

class MatrixGraph {
    private int[][] matrix;

    private char[] vertex;
    private char[][] edges;

    public MatrixGraph(char[] vertex, char[][] edges) {
        this.vertex = vertex;
        this.edges = edges;
    }

    public void buildUndirectedGraph() {
        matrix = new int[vertex.length][vertex.length];

        for (char[] c : edges) {
            int p1 = getPosition(c[0]);
            int p2 = getPosition(c[1]);

            matrix[p1][p2] = 1;
            matrix[p2][p1] = 1;
        }
    }

    public void buildDirectedGraph() {
        matrix = new int[vertex.length][vertex.length];

        for (char[] c : edges) {
            int p1 = getPosition(c[0]);
            int p2 = getPosition(c[1]);

            matrix[p1][p2] = 1;
        }
    }

    public int getPosition(char ch) {
        for (int i = 0; i < vertex.length; i++) {
            if (ch == vertex[i]) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < vertex.length; i++) {
            System.out.printf("%c: ", vertex[i]);
            for (int j = 0; j < vertex.length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

public class AdjacencyMatrix {
    public static void main(String[] args) {
        char[] vexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
        char[][] edges = new char[][]{
                {'A', 'C'},
                {'A', 'D'},
                {'A', 'F'},
                {'B', 'C'},
                {'C', 'D'},
                {'E', 'G'},
                {'D', 'G'},
                {'I', 'J'},
                {'J', 'G'}};

        MatrixGraph haha = new MatrixGraph(vexs, edges);
        haha.buildUndirectedGraph();
        haha.display();

        System.out.println("---------------------");

        haha.buildDirectedGraph();
        haha.display();
    }
}

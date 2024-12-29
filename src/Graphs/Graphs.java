package Graphs;

import java.util.LinkedList;
import java.util.Scanner;

public class Graphs {
    int vertices;
    LinkedList<Integer>[] edge;

    Graphs(int vertices) {
        this.vertices = vertices;
        edge = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            edge[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        edge[source].add(destination);
    }

    void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " has an edge to vertex: ");
            for (int edges : edge[i]) {
                System.out.print(edges + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int vertices = input.nextInt();
        Graphs g = new Graphs(vertices);
        System.out.println("Enter number of edges: ");
        int edges = input.nextInt();
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter source and destination vertices to form an edge: ");
            int source = input.nextInt();
            int destination = input.nextInt();
            g.addEdge(source, destination);
        }
        g.display();
    }
}

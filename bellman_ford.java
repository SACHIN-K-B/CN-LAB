import java.util.Scanner;
import java.util.*;

class Graph {
    int v;
    int vertices[][];
public class BellmanFordAlgorithm {

    public Graph(int v) {
        this.v = v;
        this.vertices = new int[v][3];
    }
    static final int INF = Integer.MAX_VALUE;

    public void addEdge(int s, int d, int w) {
        vertices[s][0] = s;
        vertices[s][1] = d;
        vertices[s][2] = w;
    }
    public static void bellmanFord(int[][] graph, int source) {
        int V = graph.length;
        int[] dist = new int[V];
        Arrays.fill(dist, INF);
        dist[source] = 0;

    public void printDistance(int[] dist) {
        System.out.println("Vertex\t\tDistance");
        for (int i = 0; i < v; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public void bellmanFord(int src) {
        int[] dist = new int[v];
        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        for (int i = 0; i < v - 1; i++) {
            for (int[] vertex : vertices) {
                int s = vertex[0];
                int d = vertex[1];
                int w = vertex[2];
                if (dist[s] != Integer.MAX_VALUE && dist[d] > dist[s] + w) {
                    dist[d] = dist[s] + w;
        for (int i = 0; i < V - 1; i++) {
            for (int u = 0; u < V; u++) {
                for (int v = 0; v < V; v++) {
                    if (graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                        dist[v] = dist[u] + graph[u][v];
                    }
                }
            }
        }

        for (int[] vertex : vertices) {
            int s = vertex[0];
            int d = vertex[1];
            int w = vertex[2];
            if (dist[s] != Integer.MAX_VALUE && dist[d] > dist[s] + w) {
                System.out.println("Graph has negative cycle");
                return;
        for (int u = 0; u < V; u++) {
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
        }

        printDistance(dist);
        printArr(dist, V);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int nv = scanner.nextInt();
        System.out.print("Enter the number of edges: ");
        int ne = scanner.nextInt();

        Graph g = new Graph(nv);

        System.out.println("Enter source, destination, and weights of edges:");
        for (int i = 0; i < ne; i++) {
            int s = scanner.nextInt();
            int d = scanner.nextInt();
            int w = scanner.nextInt();
            g.addEdge(s, d, w);
    public static void printArr(int[] dist, int V) {
        System.out.println("Vertex Distance from Source:");
        for (int i = 0; i < V; ++i) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF VERTICES\n");
        int n=sc.nextInt();
         System.out.println("ENTER THE Graph\n");
          int [][]graph=new int[n][n];

        System.out.print("Enter source node: ");
        int src = scanner.nextInt();
          for (int i=0; i<n; i++) 
          {
            for (int j=0; j<n; j++) 
              graph[i][j]=sc.nextInt();

        g.bellmanFord(src);
          }

        scanner.close();
        bellmanFord(graph, 0);
    }
}

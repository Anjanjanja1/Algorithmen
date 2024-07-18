package CC04_BreadthSearch;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayGraph graph = new ArrayGraph(8); // Adjusted to include vertex 7
        ArrayList<Integer> visited = new ArrayList<Integer>();

        // Example with the first set of edges
        graph.addEdge(1, 0);
        graph.addEdge(0, 7);
        graph.addEdge(0, 3);
        graph.addEdge(7, 4);
        graph.addEdge(7, 5);
        graph.addEdge(4, 3);
        graph.addEdge(4, 2);
        graph.addEdge(5, 2);
        graph.addEdge(5, 6);
        graph.addEdge(3, 2);

        graph.performBreadthSearch(3, visited);
        System.out.println("[SOLL] [3, 0, 2, 4, 1, 7, 5, 6]");
        System.out.println("[IST ] " + visited.toString());

        // Reset visited list for the second example
        visited.clear();

        // Example with the second set of edges
        graph = new ArrayGraph(7); // Adjusted to include vertex 6
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(4, 6);
        graph.addEdge(5, 4);
        graph.addEdge(6, 3);
        graph.addEdge(3, 1);

        graph.performBreadthSearch(1, visited);
        System.out.println("[SOLL] [1, 2, 4, 5, 6, 3]");
        System.out.println("[IST ] " + visited.toString());
    }
}

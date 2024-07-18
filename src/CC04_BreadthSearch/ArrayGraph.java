package CC04_BreadthSearch;

import java.util.ArrayList;

public class ArrayGraph {
    private int[][] graph;
    private int size;

    public ArrayGraph(int size) {
        graph = new int[size][size];
        this.size = size;
    }

    public boolean addEdge(int from, int to) {
        if ((from >= size) || (to >= size))
            return false;

        graph[from][to] = 1;
        graph[to][from] = 1;
        return true;
    }

    public void performBreadthSearch(int startVertex, ArrayList<Integer> visited) {
        boolean[] visitedArray = new boolean[size];
        SimpleQueue queue = new SimpleQueue(size);

        visitedArray[startVertex] = true;
        queue.enqueue(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();
            visited.add(vertex);

            for (int i = 0; i < size; i++) {
                if (graph[vertex][i] == 1 && !visitedArray[i]) {
                    visitedArray[i] = true;
                    queue.enqueue(i);
                }
            }
        }
    }
}

package CC04_BreadthSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        visited.add(startVertex);
        //Search for a startVertex nachbarn
        for (int i = 0; i < size; i++) {
            //Where is the connection?
            if (graph[startVertex][i] == 1) {
                //
                if (!visited.contains(i)) {
                    performBreadthSearch(i, visited);
                }
            }
        }
    }


}


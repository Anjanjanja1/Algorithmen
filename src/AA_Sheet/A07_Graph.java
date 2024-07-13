package AA_Sheet;
import java.util.*;

class A07_Graph {
    private int V;
    private LinkedList<Integer> adj[];

    A07_Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Insert vertex: O(1)
    void addVertex(int v) {
        if (v >= V) {
            V++;
            adj = Arrays.copyOf(adj, V);
            adj[V - 1] = new LinkedList();
        }
    }

    // Insert edge: O(1)
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Search (BFS): O(V + E)
    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Search (DFS): O(V + E)
    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // Delete vertex: O(V)
    void deleteVertex(int v) {
        adj[v] = null;
        for (int i = 0; i < V; i++) {
            if (adj[i] != null) {
                adj[i].remove(Integer.valueOf(v));
            }
        }
    }

    // Delete edge: O(E)
    void deleteEdge(int v, int w) {
        adj[v].remove(Integer.valueOf(w));
    }
}


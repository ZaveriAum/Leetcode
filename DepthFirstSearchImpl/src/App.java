import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Create vertices
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        // Define edges
        v0.setNeighbours(Arrays.asList(v5, v6, v1));
        v1.setNeighbours(Arrays.asList(v3, v4, v5));
        v4.setNeighbours(Arrays.asList(v2, v6));
        v6.setNeighbours(Arrays.asList(v0));
        // Perform BFS
        DepthFirstSearch<Integer> dfs = new DepthFirstSearch<>(v0);
        System.out.println("DFS Traversal:");
        // dfs.traverse();
        dfs.traverseRecursively(v0);
    }
}

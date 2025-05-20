public class App {
    public static void main(String[] args) {
        // Create vertices
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        // Define edges
        v0.addNeighbour(v1);
        v0.addNeighbour(v5);
        v0.addNeighbour(v6);
        v1.addNeighbour(v3);
        v1.addNeighbour(v4);
        v1.addNeighbour(v5);
        v4.addNeighbour(v2);
        v4.addNeighbour(v6);
        v6.addNeighbour(v0);

        // Perform BFS
        BreadthFirstSearch<Integer> bfs = new BreadthFirstSearch<>(v0);
        System.out.println("BFS Traversal:");
        bfs.traverse();
    }
}

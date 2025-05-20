import java.util.Stack;

public class DepthFirstSearch<T> {
    private final Vertex<T> startingVertex;

    public DepthFirstSearch(Vertex<T> startingVertex) {
        this.startingVertex = startingVertex;
    }

    public void traverse(){
        Stack<Vertex<T>> stack = new Stack<>();
        stack.push(startingVertex);
        while(!stack.isEmpty()){
            Vertex<T> current = stack.pop();
            if (!current.isVisited()){
                current.setVisited(true);
                System.out.println(current.getData());

                current.getNeighbours().forEach(stack::push);
            }
        }
    }
    
    public void traverseRecursively(Vertex<T> vertex){
        vertex.setVisited(true);
        System.out.println(vertex.getData());
        vertex.getNeighbours().stream()
            .filter(neighbour -> !neighbour.isVisited())
            .forEach(this::traverseRecursively);
    }
}

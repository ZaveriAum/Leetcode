import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T>{
    
    private final Vertex<T> startVertex;

    public BreadthFirstSearch(Vertex<T> startVertex) {
        this.startVertex = startVertex;
    }

    public void traverse(){
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(this.startVertex);
        while(!queue.isEmpty()){
            Vertex<T> current = queue.poll();
            if(!current.getVisited()){
                current.setVisited(true);
                queue.addAll(current.getNeighbours());
                System.out.println(current.getData());
            }
        }
    }

}

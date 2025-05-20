import java.util.ArrayList;
import java.util.List;

public class Vertex<T>{
    private final T data;
    
    private boolean visited;
    private List<Vertex<T>> neighbours = new ArrayList<>();

    public Vertex(T data){
        this.data = data;
    }
    
    public T getData(){
        return this.data;
    }
    
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex<T>> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex<T>> neighbours) {
        this.neighbours = neighbours;
    }
}
import java.util.LinkedList;
import java.util.List;

public class Vertex<T>{
    private final T data;
    
    private boolean visited;
    private List<Vertex<T>> neighbours = new LinkedList<>();
    
    
    public Vertex(T data) {
        this.data = data;
    }
    
    public T getData(){
        return this.data;
    }
    
    public boolean getVisited(){
        return this.visited;
    }
    
    public void setVisited(boolean visited){
        this.visited = visited;
    }
    
    public List<Vertex<T>> getNeighbours(){
        return this.neighbours;
    }
    
    public void addNeighbour(Vertex<T> neighbour) {
        this.neighbours.add(neighbour);
    }
    
}
public class Node {
    public int val;

    public Node next;

    public int length;

    public Node(){}

    public Node(int value){
        this.val = value;
        this.next = null;
        this.length = 0;
    }

    public Node(int value, Node newNode){
        this.val = value;
        this.next = newNode;
    }

}

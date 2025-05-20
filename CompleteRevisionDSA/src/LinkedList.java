public class LinkedList {
    public Node head;

    public LinkedList(){ this.head = null; }

    // Add first
    public void AddFirst(int val){
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            head.length++;
            return;
        }
        newNode.next = head;
        head = newNode;
        head.length++;
    }

    // Add last
    public void AddLast(int val){
        Node newNode = new Node(val);
        Node temp = head;
        if(head == null) {
            head = newNode;
            head.length++;
            return;
        }
        while(temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        head.length++;
    }

    // Delete first
    public void DeleteFirst(){
        if(head.next == null){
            head = null;
            return;
        }
        head = head.next;
    }

    // Delete last
    public void DeleteLast(){
        Node temp = head;
        if(head.next == null){
            head = null;
            return;
        }
        while(temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    // Exists
    public boolean Exists(int val){
        if(head == null) return false;
        while(head != null){
            if(head.val == val)
                return true;
            head = head.next;
        }
        return false;
    }

    // Print
    public void PrintList(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + ", ");
            temp = temp.next;
        }
    }
}

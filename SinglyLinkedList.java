public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList(){
        this.head = null;
    }
    // SLL methods, add node is given first below
    public void add(int value) {
        Node newNode = new Node(value);
        if(this.head == null) {   // if there is no head then assign the newNode to be the head
            this.head = newNode;
        } else {
            Node runner = this.head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode; // hmmmmm
        }
    }
    // add remove myself
    public void remove() {
        Node runner = this.head;   // this line I don't get
        while( runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
    }

    public void printValues(){
        Node runner = this.head;
        while(runner != null){
            System.out.println("lala");
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
}
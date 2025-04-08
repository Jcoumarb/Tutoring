public class IntQueue {
    Node head;
    Node tail;

    public IntQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(int val) {
        Node add = new Node(val, null);

        if(this.head == null) {
           this.head = add;
           this.tail = add;
        } else {
            this.tail.next = add;
            this.tail = add;
        }
    }

    public int dequeue() {
        if(this.head == null) {
            System.out.println("Queue Empty");
            return -1;
        }

        int element = this.head.val;

        if(this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }

        return element;
    }

    public void printQueue() {
        String out = "";

        Node iterator = this.head;
        while(iterator != null) {
            out += iterator.val + " ";
            iterator = iterator.next;
        }

        System.out.println(out);
    }

    public class Node{
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

public class LinkedList {
   Node first;
   Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }


    public void add(int val) {
        Node add = new Node(val, null);
        
        if(this.first == null) {
            this.first = add;
            this.last = add;
        } else {
            this.last.next = add;
            this.last = add;
        }
    }
    
    public void print() {
        String out = "";

        Node iterator = this.first;
        while (iterator != null) {
            out += iterator.val + " ";
            iterator = iterator.next;
        }

        System.out.println(out);
    }
 
    public class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }



}

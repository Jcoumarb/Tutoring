public class IntStack {
    Node Top;

    public IntStack() {
        Top = null;
    }

    public void push(int val) {
        Node add = new Node(val, Top);
        this.Top = add;

    }

    public int pop() {
        if(Top == null) {
            System.out.println("Stack Empty");
            return 0;
        }

        int element = Top.val;
        this.Top = Top.next;
        return element;
    }

    public void printStack() {
        String out = "";

        Node iterator = Top;
        while(iterator != null) {
            out += iterator.val + "\n";
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

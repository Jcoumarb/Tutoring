public class Main {
    public static void main(String[] args) {
       /* LinkedList car = new LinkedList();

        car.add(1);
        car.add(3);
        car.add(15);
        car.add(-20);
        car.print();*/

        /*IntStack s = new IntStack();
        
        s.push(20);
        s.push(41);
        int a = 0;
        s.pop();
        a = s.pop();
        s.push(1);
        s.push(50);
        s.push(a/4);
        s.printStack();*/

        IntQueue i = new IntQueue();

        i.enqueue(40);
        i.enqueue(20);
        i.enqueue(61);
        i.dequeue();
        i.printQueue();

    }
}

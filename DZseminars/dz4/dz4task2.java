package DZseminars.dz4;

import java.util.LinkedList;

public class dz4task2 {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue;
        myQueue = new MyQueue<>();
        System.out.println(myQueue.getElements());

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(4);
        System.out.println(myQueue.getElements());

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.getElements());

        System.out.println(myQueue.first());
    }

}

class MyQueue<T> {
    public LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T element) {
        queue.add(queue.size(), element);
    }

    public T dequeue() {
        return queue.remove(0);
    }

    public T first() {
        return queue.get(0);
    }

    public LinkedList<T> getElements() {

        return queue;
    }
}

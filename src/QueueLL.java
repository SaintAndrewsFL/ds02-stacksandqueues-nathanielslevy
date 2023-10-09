import java.util.ArrayList;
import java.util.LinkedList;

public class QueueLL<T> {

    private LinkedList<T> linkedList = new LinkedList();

    public T enqueue(T item) {
        linkedList.addFirst(item);
        return item;
    }

    public T dequeue() {
        T item = linkedList.getFirst();
        linkedList.removeFirst();
        return item;
    }

    public T peek() {
        return linkedList.getFirst();
    }

    public void display() {
        for (T element : linkedList) {
            System.out.println(element);
        }
    }

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

}



/*
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */
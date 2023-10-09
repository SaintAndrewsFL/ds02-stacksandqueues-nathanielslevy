import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class QueueArray<T> {

    private ArrayList<T> arr = new ArrayList();


    public T enqueue(T item) {
        arr.add(item);
        return item;
    }

    public T dequeue() {
        T item = arr.get(0);
        arr.remove(0);
        return item;
    }

    public T peek() {
        return arr.get(0);
    }

    public void display() {
        for (int i=0; i<arr.size(); i++) {
            System.out.print(i);
        }
    }

    public int size() {
        return arr.size();
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

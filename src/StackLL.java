import java.util.ArrayList;
import java.util.LinkedList;

public class StackLL<T> {

    private LinkedList<T> linkedList = new LinkedList();

    public T push(T item) {
        linkedList.addFirst(item);
        return item;
    }

    public T pop() {
        T item = linkedList.getLast();
        linkedList.removeLast();
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
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */
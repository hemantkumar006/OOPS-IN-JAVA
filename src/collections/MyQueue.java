package collections;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        //whenever we see <> bracket, it following java generics.

        //Here LinkedList is a class(which implements the queue interface)
        // and queue is a type of interface which extends collections

        stringQueue.add("Hemant");
        stringQueue.add("kumar");
        stringQueue.add("neha");
        stringQueue.add("nikhil");
        System.out.println(stringQueue);

        //remove first element from queue and queue is empty , it will return null, not exceptions
        stringQueue.poll();
        System.out.println(stringQueue);

        //when the queue is still empty , it will throw the exception
        stringQueue.remove();

        //have to study about DEQUE: Double Ended Queue(As a homework)
    }
}

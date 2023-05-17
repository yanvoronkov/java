package Seminars;

import java.util.LinkedList;

public class MyQueue<I extends Number> {
    private LinkedList<Integer> array = new LinkedList<>();
    int size = 0;

    public void enqueue(int value) {
        array.addLast(value);
    }

    public void dequeue(){
        array.removeFirst();
    }

    public void first(){
        System.out.println(array.getFirst());
    }
}

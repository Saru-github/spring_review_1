package dataStructure;

import java.util.ArrayList;


public class MyQueue<T>{

    // Queue ArrayList 로 구현

    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        }
    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T item){
        queue.add(item);
    }

    public T dequeue(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

}

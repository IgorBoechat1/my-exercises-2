package io.codeforall.bootcamp.bqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

    private LinkedList<T> queue;
    private int limit;

    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */
    public BQueue(int limit) {
        this.queue = new LinkedList<T>();
        this.limit = limit;
    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */
    public synchronized void offer(T data) {
        while (this.isFull()) {
            try {
                System.out.println("I don't have more space to produce more pizza!");
                wait(); // release the lock and block until we get interrupted
            } catch (InterruptedException e) {
            }


        }
        System.out.println("WOW, A new Pizza was made! \n");
        this.queue.offer(data);
        notifyAll();
    }


    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public synchronized T poll() {
        while (this.isEmpty()) {
            try {
                System.out.println("Where are the PIZZAS?");
                wait(); // release the lock and block until we get interrupted
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Yummy, delicious pizza \n");
        T data = this.queue.remove();
        notifyAll();
        return data;
    }


    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public int getSize() {
        return this.queue.size();

    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {
        return limit;
    }

    public synchronized boolean isFull() {
        return this.queue.size() == this.limit;
    }

    public synchronized boolean isEmpty() {
        return this.queue.size() == 0;
    }
}

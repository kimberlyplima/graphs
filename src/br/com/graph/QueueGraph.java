/*
 * This is a simple implementation of a queue structure using Queue interface
 * and linkedlists.
 */
package br.com.graph;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class QueueGraph {
    
    private Queue<Integer> queue;
    
    public QueueGraph(){
        queue = new LinkedList();
    }
    
    /*
     * Adds a new element in the queue.
     */
    public void enqueue(Integer vertex){
        queue.add(vertex);
    }
    
    /*
     * Removes the first element in the queue.
     */
    public Integer dequeue(){
        return queue.remove();
    }
    
    /*
     * Returns que number of elements in the queue.
     */
    public int queueSize(){
        return queue.size();
    }
    
    /*
     * Checks if the queue is empty. If it is, returns true.
     */
    public Boolean isEmpty(){
        return queue.isEmpty();
    }
    
    /*
     * Returns the first element of the queue.
     */
    public Integer getInteger(){
        return queue.peek();
    }
}

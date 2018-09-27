/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    public void enqueue(Integer vertex){
        queue.add(vertex);
    }
    
    public Integer dequeue(){
        return queue.remove();
    }
    
    public int queueSize(){
        return queue.size();
    }
    
    public Boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public Integer getInteger(){
        return queue.peek();
    }
}

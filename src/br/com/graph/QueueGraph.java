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
    
    private Queue<Vertex> queue;
    
    public QueueGraph(){
        queue = new LinkedList();
    }
    
    public void enqueue(Vertex vertex){
        queue.add(vertex);
    }
    
    public Vertex dequeue(){
        return queue.remove();
    }
    
    public int queueSize(){
        return queue.size();
    }
    
    public Boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public Vertex getVertex(){
        return queue.peek();
    }
    
    public void showQueue(){
        Iterator<Vertex> i = queue.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next().getValue());
        }
    }
}

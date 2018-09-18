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
    
    private Queue<String> queue;
    
    public QueueGraph(){
        queue = new LinkedList();
    }
    
    public void enqueue(String vertex){
        queue.add(vertex);
    }
    
    public String dequeue(){
        return queue.remove();
    }
    
    public int queueSize(){
        return queue.size();
    }
    
    public Boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public String getVertex(){
        return queue.peek();
    }
    
    public void showQueue(){
        Iterator<String> i = queue.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

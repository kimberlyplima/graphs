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
public class Graph{
    private List<LinkedList> graph;
    private LinkedList<Vertex> adjList;
    
    public Graph(){
        graph = new LinkedList();
        adjList = new LinkedList();
        
        graph.add(adjList);
    }
    
    public void addArc(Vertex inicialVertex, Vertex finalVertex){
        if(!graph.contains(inicialVertex)){
            adjList.add(inicialVertex);
            adjList.add(finalVertex);
            graph.add(adjList);
        }
        
        int index = graph.indexOf(adjList);
        graph.get(index).add(finalVertex);
    }
    
    public int sizeGraph(){
        Iterator<LinkedList> i = graph.iterator();
        int size = 0;
        
        while(i.hasNext()){
            size += i.next().size();
        }
        
        return size;
    }
    
    public void showGraph(){
        for(LinkedList i: graph){
            Iterator<Vertex> j = i.iterator();
            
            while(j.hasNext()){
                System.out.print(j.next().getValue() + " ");
            }
        }
    }
}

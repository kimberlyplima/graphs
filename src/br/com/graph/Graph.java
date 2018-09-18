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
    private HashMap<String, LinkedList> graph;
    private LinkedList<String> adj;
    
    public Graph(){
        graph = new HashMap();
    }
    
    public void addNewEdge(String inicialVertex, String finalVertex){        
        if(!graph.containsKey(inicialVertex)){            
            adj = new LinkedList();
            this.adj.add(finalVertex);
            graph.put(inicialVertex, this.adj);
        } else graph.get(inicialVertex).add(finalVertex);
    }
    
    public LinkedList<String> returnAdj(String key){
        LinkedList<String> adj = new LinkedList();
            
            if(graph.containsKey(key)){
                adj = graph.get(key);
                return adj;
            } else return null;
    }
    
    public int sizeGraph(){
        int sizeGraph;
        sizeGraph = 0;
        
        Iterator<LinkedList> i = graph.values().iterator();
        
        while(i.hasNext()){
            sizeGraph += i.next().size();
        }
        
        return sizeGraph;
    }
    
    public void showGraph(){
        Iterator<Map.Entry<String, LinkedList>> i = graph.entrySet().iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

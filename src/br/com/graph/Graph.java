/*
 * This is an implementation of a simple graph of integers.
 */
package br.com.graph;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class Graph {
    private Map<Integer, LinkedList<Integer>> graph;
    
    public Graph(){
        graph = new HashMap();
    }
    
    /*
    * This method checks if the initial node already exists on the map.
    *
    * If the existing mappings don't contain the node, a new mapping is created
    * adding the inicial given node as the key of the mapping
    * and a null linkedlist as the value. It also adds the final node as an
    * adjacency of the inicial node.
    *
    * If the map contains the inicial given node, the final node is added as an 
    * adjacency of it (it's added on the linkedlist).
    */
    public void buildGraph(Integer inicialVertex, Integer finalVertex){
        if(!graph.containsKey(inicialVertex)){
            graph.put(inicialVertex, new LinkedList());
            graph.get(inicialVertex).add(finalVertex);
        } else graph.get(inicialVertex).add(finalVertex);
    }
    
    /*
    * Prints the entire map.
    */
    public void showGraph(){
        Iterator<Map.Entry<Integer, LinkedList<Integer>>> i;
        i = graph.entrySet().iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
    /*
    * @return an integer containing the number of keys in this map.
    */
    public Integer sizeGraph(){
        return graph.size();
    }

    /**
     * @return the adjacencies of the given node.
     */
    public LinkedList<Integer> getAdjList(Integer vertex) {
        if(graph.get(vertex).contains(null)){
            return null;
        } else return graph.get(vertex);
    }
}

/*
 * This is a simple implementation of the BFS search and it returns a 
 * visitation vector.
 */
package br.com.graph;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class Bfs {
    QueueGraph queue;
    
    public Bfs(Graph graph, Integer vertex){
        int v;
        int size = graph.sizeGraph();
        int[] distance = new int[size];
        Map numCitiesDist = new HashMap(size);
        
        Arrays.fill(distance, -1);
        queue = new QueueGraph();
        
        v = vertex;
        distance[v] = 0;
        queue.enqueue(v);
        
        while(!queue.isEmpty()){
            v = queue.getInteger();
            queue.dequeue();
            
            if(graph.getAdjList(v) != null){
                Iterator<Integer> i = graph.getAdjList(v).iterator();
            
                while(i.hasNext()){
                    int index = i.next();

                    if(distance[index] == -1){
                        distance[index] = distance[v]+1;
                        queue.enqueue(index);
                    } 
                }
            }
        }
        
        for(int j = 0; j < distance.length; j++){
            int cont = 0;
            
            //numCitiesDist.put(0, 0);
            
            if(!numCitiesDist.containsKey(distance[j])){
                if(distance[j] != 0){
                    numCitiesDist.put(distance[j], 1);
                }
            } else {
                    if(distance[j] != 0){
                        cont = (int) numCitiesDist.get(distance[j]) + 1;
                        numCitiesDist.replace(distance[j], cont);
                    }
                }
            
            if(!numCitiesDist.containsKey(j)){
                numCitiesDist.put(j, 0);
            }
        }
        
        System.out.println(numCitiesDist.values());
    }
}

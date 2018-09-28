/*
 * In addition to the BFS search implementation, this class also counts
 * the number of nodes at a given distance and includes these values in a
 * map, where the key is the distance and the values are the number of nodes at
 * that distance.
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
        
        /*
         * In this loop the map is filled with the distances and the 
         * correspondent number of nodes.
         * It is also filled with zero on those "distances" which don't exist.
         */
        for(int j = 0; j < distance.length; j++){
            int cont = 0;
            
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

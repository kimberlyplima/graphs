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
public class SearchVertices {
    QueueGraph queue;
    BuildGraph c = new BuildGraph();
    Graph graph = c.buildGraph();
    int size;

    public SearchVertices(String inicialVertex){
        size = graph.sizeGraph();
        boolean[] visited = new boolean[size];
        int[] distanceCities = new int[size-1];
        int level = 0;
        int cont = 0;
        String v;
        
        Arrays.fill(distanceCities, 0);
        Arrays.fill(visited, Boolean.FALSE);
        visited[Integer.parseInt(inicialVertex)] = true;
        
        queue = new QueueGraph();
        queue.enqueue(inicialVertex);
        
        while(!queue.isEmpty()){
            distanceCities[level] = cont;
            cont = 0;
            
            v = queue.getVertex();
            queue.dequeue();
            
            if(graph.returnAdj(v) != null){
                Iterator<String> i = graph.returnAdj(v).iterator();
                
                while(i.hasNext()){
                cont++;
                String next = i.next();
                int counter = Integer.parseInt(next);
                
                    if(visited[counter] == false){
                        visited[counter] = true;
                        queue.enqueue(next);
                    }
                } level++;
            }
        }
        
        for(int i = 0; i < distanceCities.length; i++){
            System.out.print(distanceCities[i] + " ");
        }
    }
}

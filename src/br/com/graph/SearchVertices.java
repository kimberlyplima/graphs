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

    public SearchVertices(String inicialVertex){
        int size = graph.sizeGraph();
        boolean[] visited = new boolean[size];

        int[] distanceCities = new int[size];
        int level = 0;
        int cont = 0;
        String v;
        
        Arrays.fill(distanceCities, 0);
        Arrays.fill(visited, Boolean.FALSE);
        
        visited[Integer.parseInt(inicialVertex)] = true;
        
        queue = new QueueGraph();
        queue.enqueue(inicialVertex);
        
        while(!queue.isEmpty()){
            v = queue.getVertex();
            queue.dequeue();
            
            LinkedList adj = graph.returnAdj(v);
            Iterator<String> i = graph.returnAdj(v).iterator();
            
            distanceCities[Integer.parseInt(v)] = adj.size();

            while(i.hasNext()){
                String next = i.next();
                int position = Integer.parseInt(next);

                    if(visited[position] == false){
                        visited[position] = true;
                        queue.enqueue(next);
                    }
            }
        }
        
        for(int i = 0; i < distanceCities.length; i++){
            System.out.print(distanceCities[i] + " ");
        }
    }
}

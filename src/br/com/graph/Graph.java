/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graph;

import java.util.HashMap;


/**
 *
 * @author kimberlyplima
 */
public class Graph {
    
    int next_id = 0;
    public HashMap<Integer, Vertex> vertices;
    
    public Graph(){
        this.vertices = new HashMap<Integer, Vertex>();
    }
    
    public void addVertex(String name){
        Vertex vertex = new Vertex(name, next_id);
        vertices.put(next_id++, vertex);
    }
    
    public Vertex getVertex(int id){
        if(!vertices.containsKey(id)){
            return null;
        }
        return vertices.get(id);
    }
    
    public void addAdjacency(Vertex inicial, Vertex dest, int cost){
        Edge edge = new Edge(cost);
        
        if(!inicial.direction.containsKey(dest)){
            inicial.direction.put(dest, edge);
        }
        
        if(!dest.direction.containsKey(inicial)){
            dest.direction.put(inicial, edge);
        }
    }
    
}

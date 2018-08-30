/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graph;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kimberlyplima
 */
public class Vertex {
    
    private String name;
    private int id;
    public HashMap<Vertex, Edge> direction;

    public Vertex(String name, int id){
        this.name = name;
        this.id = id;
        this.direction = new HashMap<Vertex, Edge>();
    }
        
}

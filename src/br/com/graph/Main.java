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
public class Main {
    
    public static void main(String[] args){
        OpenFile t = new OpenFile();
        Graph g = new Graph();
        int size = t.OpenFile().size();
        int mainCity = 0;
        
        for(int i = 0; i < t.OpenFile().size(); i++){
            int index = i;
            int value = Integer.parseInt(t.OpenFile().get(i).toString());
            
            if(index != value){
                g.buildGraph(index, value);
                g.buildGraph(value, index);
            } else mainCity = index;

        }
        
        g.showGraph();
        
        Bfs search = new Bfs(g, mainCity);
    }
    
}

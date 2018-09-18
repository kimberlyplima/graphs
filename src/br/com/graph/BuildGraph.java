/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graph;

/**
 *
 * @author kimberlyplima
 */
public class BuildGraph {
    public Graph buildGraph(){
        OpenFile t = new OpenFile();
        Graph g = new Graph();
        
        for(int i = 0; i < t.OpenFile().size(); i++){
            String index = Integer.toString(i);
            String value = t.OpenFile().get(i).toString();

            if(index == value){
                g.addNewEdge(value, index);
            } else g.addNewEdge(value, index);
        }

        g.showGraph();
        return g;
    }
}

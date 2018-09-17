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
public class Main {
    public static void main(String[] args) {
        Vertex zero = new Vertex(0);
        Vertex um = new Vertex(1);
        Vertex dois = new Vertex(2);
        Vertex tres = new Vertex(3);
        Vertex quatro = new Vertex(4);
        Vertex cinco = new Vertex(5);
        Vertex seis = new Vertex(6);
        Vertex sete = new Vertex(7);
        Vertex oito = new Vertex(8);
        
        Graph graph = new Graph();
        
        graph.addArc(zero, um);
        //graph.addArc(zero, dois);
        //graph.addArc(um, tres);
        //graph.addArc(dois, seis);
        //graph.addArc(dois, sete);
        //graph.addArc(tres, quatro);
        //graph.addArc(tres, cinco);
        //graph.addArc(sete, oito);
        
        //graph.showGraph();
        
        //System.out.println(graph.sizeGraph());
        
    }
    
}

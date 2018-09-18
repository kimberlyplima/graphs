/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.graph;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author kimberlyplima
 */
public class OpenFile {
    
    public ArrayList OpenFile(){
        String nameFile = "vetor.txt";
        ArrayList t = new ArrayList();
        
        try{
            BufferedReader readFile = new BufferedReader(new FileReader(nameFile));
            String line = readFile.readLine();

            line = line.replace(" ", "");
            line = line.replace("[", "");
            line = line.replace("]", "");
            line = line.replace(",", "");
        
            for(int i = 0; i < line.length(); i++){
                t.add(line.charAt(i));
            }
            
            readFile.close();
            return t;
        }
        
        catch(Exception IOException){
            System.out.println("Erro ao ler o arquivo.");
            return null;
        }
    }    
}

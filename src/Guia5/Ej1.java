/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author 54358
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
            
            
        }
        for (int i = 100; i > 0  ; i--) {
            System.out.print(vector[i-1]+" ; ");
            
        }
    }
    
}

    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author 54358
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n; 
        n = leer.nextInt();
        
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 10);
            
        }
        System.out.println("Ingrese el valor que desea buscar: ");
        int num = leer.nextInt();
        int aux = 0;
         System.out.println("El numero" + num +" se encuentra en las posiciones: ");
        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                aux ++; 
                System.out.print( i+" ,");
            }
        }
        System.out.println("se repite:" + aux + " veces");
    }
    
}

  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 54358
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("ingrese la cantidad de filas");
        int f = leer.nextInt();
        System.out.println("ingrese la cantidad de columnas");
        int c = leer.nextInt();
        int[][] matriz = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        int suma = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                suma += matriz[i][j];
            }

        }
        System.out.println("la suma de la matriz es " +suma);
    }
}
    



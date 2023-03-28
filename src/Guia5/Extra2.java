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
public class Extra2 {

    /**
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia
     * entre los elementos).
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimencion de los vectores:");
        int dim = leer.nextInt();
        int[] vectorA = new int[dim];
        int[] vectorB = new int[dim];
        llenarvector(vectorA, dim);
        llenarvector(vectorB, dim);
        mostrarVector(vectorA, dim);
        mostrarVector(vectorB, dim);
        compararVector(vectorA, vectorB, dim);
    }

    public static int[] llenarvector(int[] vec, int dim) {
        for (int i = 0; i < dim; i++) {
            vec[i] = (int) (Math.random() * 10);
        }
        return vec;
    }

    public static void compararVector(int[] a, int[] b, int dim) {
        int aux = 0;
        for (int q = 0; q < dim; q++) {
            if (a[q] == b[q]) {
                aux++;
            } else {
                System.out.println("Los vectores no son iguales.");
                q = dim - 1;
            } 
               if (aux==(dim-1)){
            System.out.println("Los vectores son iguales.");
        }
     
        }
    }

    public static void mostrarVector(int[] a, int d) {
        for (int i = 0; i < d; i++) {
            System.out.print(a[i] + "-");
        }
        System.out.println(" ");
    }
}

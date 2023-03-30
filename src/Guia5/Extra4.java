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
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] varPrac = new int[10][4];
        double[] promedios = new double[10];
        ingresarnotas(varPrac);
        calcularpromedios(promedios,varPrac);
        int contA=0;
        int contD=0;
        for (int i = 0; i < 10; i++) {
            if(promedios[i]>= 7){
                contA++;
            }else contD++;
        }
        System.out.println("Aprobados: "+ contA +".");
        System.out.println("Desaprobados: " + contD +".");
    }
    public static int[][] ingresarnotas(int[][]practicos){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno # " + (i+1) + ".");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota # " + (j+1) + ":");
                practicos[i][j] = leer.nextInt();
            }
        }
        return practicos;
    }
    public static double[] calcularpromedios(double[] prom,int[][]notas){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                prom[i] = 0.1*notas[i][0] + 0.15*notas[i][1] 
                        + 0.25*notas[i][2] + 0.5*notas[i][3];
            }
        }
        return prom;
    }
}

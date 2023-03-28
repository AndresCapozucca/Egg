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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        llenarMatriz(matrizA, sc);
        matrizAT(matrizA, matrizB);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] == -matrizB[i][j]) {
                    cont++;
                }
            }
        }
        if (cont == 9) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
        /*int[][] matriz = {{0,-2,4,3},{2,4,-1,-4},{-4,1,4,5},{-3,4,-5,4}};
      int k = 0;
    for (int i=0; i<4;i++){
        for(int j=0;j<4;j++){
            if(i!=j){
                if(matriz[i][j]==-matriz[j][i]){
                    k++;
                }
            }                                                        VERSION 2
        }
    }   
    if(k==12){
        System.out.println("La matriz es Asimetrica");
    }else{
        System.out.println("La matriz no es Asimetrica");
    }*/
    }

    public static int[][] llenarMatriz(int[][] matrizA, Scanner sc) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un valor: ");
                matrizA[i][j] = sc.nextInt();
            }
        }
        return matrizA;
    }

    public static int[][] matrizAT(int[][] matrizA, int[][] matrizB) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }
        return matrizB;
    }
}
  
    


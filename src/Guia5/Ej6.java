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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][]matriz = new int[3][3];
        llenarMatriz(matriz,leer);
        int fila1=0,fila2=0,fila3=0,columna1=0,columna2=0,columna3=0,diag1=0,diag2=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             if (i==j){
              diag1= diag1 + matriz[i][j];     
             }   
              if((i==0 && j==2) || (i==2 && j==0)||(i==1 && j==1)){
              diag2+=matriz[i][j];   
              }
              if (i==0){
              fila1+=matriz[i][j];  
              }   
              if (i==1){
              fila2+=matriz[i][j];  
              } 
              if (i==2){
              fila3+=matriz[i][j];  
              } 
              if (j==0){
              columna1+=matriz[i][j];  
              } 
              if (j==1){
              columna2+=matriz[i][j];  
              } 
              if (j==2){
              columna3+=matriz[i][j];  
              } 
            }  
        }      
       if (columna1==columna2 && columna2==columna3 && columna3==fila1 && fila1==fila2 && 
               fila2==fila3 && fila3==diag1 && diag1==diag2){
           System.out.println("El cuadrado es magico.");
       }else System.out.println("El cuadrado no es magico:");
    }
    public static int[][] llenarMatriz(int [][]matriz,Scanner leer){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor:");
                matriz[i][j]= leer.nextInt();
                while(matriz[i][j]> 9 || matriz[i][j]<1) {
                    System.out.println("Ingrese otro valor");
                    matriz[i][j]= leer.nextInt();
                }
            }  
        }
        return matriz;
    }
    /*Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[3][3];
        int[] suma = new int[8];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el elemento (" + i + "," + j + ")");
                matriz[i][j] = leer.nextInt();
                while (matriz[i][j] > 9 || matriz[i][j] < 0) {
                    System.out.println("Ingrese un numero entre 1 y 9");
                    System.out.print("Ingrese el elemento (" + i + "," + j + ")");
                    matriz[i][j] = leer.nextInt();
                }

            }
        }
        //La idea es guardar la suma de cada fila en los slot 0,1 y 2 del vector suma (aux1)
        //la suma de cada columna en 3, 4 y 5 (aux2)
        //Las diagonales se guardan en 6 y 7(aux3 y aux4)

        int k = 0, l = 3, m = 2, aux1 = 0, aux2 = 0, aux3 = 0, aux4 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                aux1 += matriz[i][j];
                aux2 += matriz[j][i];
            }

            aux3 += matriz[i][m];
            aux4 += matriz[i][i];

            suma[k] = aux1;
            suma[l] = aux2;
            k++;
            l++;
            m--;
            aux1 = 0;
            aux2 = 0;
        }
        suma[6] = aux3;
        suma[7] = aux4;

        int o = 0;
        for (int i = 1; i < 8; i++) {

            if (suma[i] == suma[0]) {
                o++;
            }
        }
        if (o == 7) {
            System.out.println("Felicitaciones Su Matriz es MAGICA");
        } else {
            System.out.println("Lamentablemente no se dio, menos magia que racing");
        }*/

}


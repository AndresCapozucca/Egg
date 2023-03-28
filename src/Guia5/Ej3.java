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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n; 
        n = leer.nextInt();
        int[] vector = new int[n];
      
        int una=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        for (int i=0; i<n; i++){
            vector [i]= (int)(Math.random()*(1-99999)+99999);
                  System.out.println(" --- " + vector[i]); 
        }
      
        
        for (int i=0; i<n; i++){
              //int cont=0;
              double x;
              double t;
              double r;
              double w;
              double c;
              x = vector[i]/10;
              if (x<1){
                una++; 
              }
              t = x/10; 
              if (t<1){
                dos++; 
              }
              r = t/10;
              if (r<1){
                tres++; 
              }
              w = r/10;
              if (w<1){
                cuatro++; 
              }
              c = w/10;
              if (c<1){
                cinco++; 
              }
              
     
            }
              cinco= cinco- cuatro;
              cuatro= cuatro- tres;
              tres= tres-dos;
              dos= dos-una;
       // switch (cont){
         //   case 1:una++;
           // break;
           // case 2:dos++;
           // break;
            //case 3:tres++;
            //break;
            //case 4:cuatro++;
            //break;
            //case 5:cinco++;
            //break;   
            //}
       
       
        System.out.println("De los " + n + " numeros creados de forma aleatoria(1-99999) "
                + " y guardados dentro del vector tenemos \n *" + cinco + " numeros de "
                + "cinco cifras. \n *" + cuatro + " numeros de cuatro cifras. \n *"
                + tres + " numeros de tres cifras. \n *" + dos +" numeros de dos cifras."
                + "\n * " + una + " numeros de una cifra.");
}
}
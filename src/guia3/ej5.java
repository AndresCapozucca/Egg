/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author 54358
 */
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here+
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo:");
        int limite = leer.nextInt();
        int suma = 0;
        int cont = 0;
        for ( suma = 0 ; suma < limite; cont++){
            System.out.println("Ingrese numero a sumar.");
            suma = suma + leer.nextInt() ;
        }
            System.out.println("Los " + cont + " numeros que ingreso suman "
             + suma + "  y superaron el limite ingresado." );
        
        
        
    }
    
}
/*Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de
los números introducidos supere el límite inicial.*/

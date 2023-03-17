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
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:  ");
        int numero = leer.nextInt();
        if (numero % 2 == 0){
        System.out.println("El Numero  " + numero + "  es par.");
        }
        else {
            System.out.println("El numero  " + numero + "  es impar.");
        }
    
    }
    
}
/*Crear un programa que dado un número determine si es par o impar.*/

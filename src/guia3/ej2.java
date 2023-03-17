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
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Frase:  ");
        String frase = leer.nextLine();
        if ("eureka".equalsIgnoreCase(frase)){
            System.out.println("Frase correcta!");
        } else {
            System.out.println("Frase incorrecta.");
        } 
   
    }
}
    
/*Crear un programa que pida una frase y si esa 
frase es igual a “eureka” el programa pondrá un 
mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.*/
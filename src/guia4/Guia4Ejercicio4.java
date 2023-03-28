/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author 54358
 */
public class Guia4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una aplicación que nos pida un número por teclado y con una
        // función se lo pasamos por parámetro para que nos indique si es o
        // no un número primo, debe devolver true si es primo, sino false.
        // Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
        //Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
        //sin embargo, 17 si es primo.
        // ¿Qué son los números primos?
        //Básicamente, un número primo es un número natural que tiene 
        //solo dos divisores o factores: 1 y el mismo número. Es decir, 
        //es primo aquel número que se puede dividir por uno y por el mismo número.
        //El primer número primo es 2, y hay 25 números primos entre 
        //1 y 100, ellos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
        //31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 100:");
        int num=leer.nextInt();
        System.out.println("¿El numero " + num + " es primo: \n" + primo(num));

    }
    public static boolean primo(int num){
        boolean vf = false;
            int cont=0;
               for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
            if ( cont == 2) {
                vf = true;
            }
        return vf;
    }    
    

}
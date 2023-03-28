/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ejercicio8 {

    /**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá \
     * dibujar lo siguiente:

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el diametro del cuadrado");
        int diametro = leer.nextInt();
        for (int i = 0; i < diametro; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int j = 0; j < diametro-2; j++) {
                System.out.print("*");
                for (int o = 0; o < diametro-2; o++) {
                    System.out.print(" ");
            }
                System.out.println("*");
            }
        for (int u = 0; u < diametro; u++) {
            System.out.print("*");
        }
    }
    
}

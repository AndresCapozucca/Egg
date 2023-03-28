/*Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
calcular su equivalente: 1 día, 2 horas.
*/
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
public class extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos:");
        int min= leer.nextInt();
        int horas = min/60;
        int dias = horas/24;
        System.out.println("Dias:  " + dias + "Horas:  " +  (horas-24*dias)) ;
    }
    
}

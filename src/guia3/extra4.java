/*Elaborar un algoritmo en el cuál se ingrese un número entre
1 y 10 y se muestre su equivalente en romano.
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
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre uno y 10.");
        int num = leer.nextInt();
        switch (num){
            case 1:
                System.out.println("El numero 1 en Romano es I");
                break;
            case 2:
                System.out.println("El numero 2 en Romano es II");
                break;
            case 3:
                System.out.println("El numero 3 en Romano es III");
                break;
            case 4:
                System.out.println("El numero 4 en Romano es IV");
                break;
            case 5:
                System.out.println("El numero 5 en Romano es V");
                break;
            case 6:
                System.out.println("El numero 6 en Romano es VI");
                break;
            case 7:
                System.out.println("El numero 7 en Romano es VII");
                break;
            case 8:
                System.out.println("El numero 8 en Romano es VIII");
                break;
            case 9:
                System.out.println("El numero 9 en Romano es IX");
                break;
            case 10:
                System.out.println("El numero 10 en Romano es X");
                break;
            default:
                System.out.println("El numero  " + num + " aun no se ha ingresado en la base de datos.");
                
        }
    }
    
}

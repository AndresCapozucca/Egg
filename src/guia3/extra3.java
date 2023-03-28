/*Elaborar un algoritmo en el cuál se ingrese una letra
y se detecte si se trata de una vocal. Caso contrario mostrar
un mensaje. Nota: investigar la función equals() de la clase String.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author 54358
 */
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        String letra = toUpperCase(leer.next());
        switch(letra){
            case "A":
                System.out.println("La letra A es una vocal.");
                break;
            case "E":
                System.out.println("La letra E es una vocal.");
                break;
            case "I":
                System.out.println("La letra I es una vocal.");
                break;
            case "O":
                System.out.println("La letra O es una vocal.");
                break;
            case "U":
                System.out.println("La letra U es una vocal.");
                break;
            default:
                System.out.println("La letra " + letra + " es una consonante.");
        }
    }
    
}

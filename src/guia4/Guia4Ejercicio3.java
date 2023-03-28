/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;


import static java.lang.Math.round;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;


public class Guia4Ejercicio3 {
    //Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    //El cambio de divisas es:
    // 0.86 libras es un 1 €
    // 1.28611 $ es un 1 €
    // 129.852 yenes es un 1 €

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese valor de Euros:");
        double cant = leer.nextDouble();
        cambio(cant,leer);
    }
    

    public static void cambio(double cant ,Scanner leer) {
        boolean error;
        do {

            System.out.println("A que moneda desea intercambiar:Libra,Dolares o Yenes(ingrese nombre de la moneda)");
            String moneda = toLowerCase(leer.next());
            switch (moneda) {
                case "libra":
                    System.out.println("Los " + cant + " Euros convertidos corresponden a: " + (round(0.86 * cant)) + " libras");
                    error = false;
                    break;
                case "dolares":
                    System.out.println("Los " + cant + " Euros convertidos corresponden a $$" + (round(1.28611 * cant)) +" Dolares.");
                    error = false;
                    break;
                case "yenes":
                    System.out.println("Los " + cant + " Euros convertidos corresponden a: " + (round(129.852 * cant)) + " Yenes");
                    error = false;
                    break;
                default:
                    System.out.println("El nombre de la moneda ingresado no se encuentra"
                            + " en el sistema o no esta bien escrito, intente nuevamente.");
                    error = true;
                    break;
             }
        }while (!error == false);
             
        }                  
       
        
    
}

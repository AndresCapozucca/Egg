/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4teoriaej1;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia4TeoriaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que procese una secuencia de caracteres ingresada
        //por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la 
        //siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto
        //      (   a -> "@" , e -> "#", i -> "$", o -> "%", u -> "*""   )
        //de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
        //*Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
        //correspondiente.Utilice la estructura “según” para la transformación.
       
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String codigo = leer.nextLine();
        codificacion(codigo);//llamada a la funcion
    }
    
    public static void codificacion(String codigo){//recibe "codigo" como argumento a modificar
        codigo = codigo.toLowerCase();//paso la frase introducida a minuscula
        for (int i = 0; i < codigo.length(); i++) {//veces repetidas del bucle
        switch (codigo.substring(i, i + 1)){//se itera por cada letra de la frase para modificarla
            case "a":
                System.out.print("@");
                break;
            case "e":
                System.out.print("#");
                break;
            case "i":                                       //Multiples opciones
                System.out.print("$");
                break;
            case "o":
                System.out.print("%");
                break;
            case "u":
                System.out.print("*");
                break;
            default:
                System.out.print(codigo.substring(i, i + 1));//se itera por cada letra de la frase para modificarla
                break;
        }
        }
    }
}

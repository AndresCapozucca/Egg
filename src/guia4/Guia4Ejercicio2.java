/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Diseñe una función que pida el nombre y la edad de N personas e 
        //imprima los datos de las personas ingresadas por teclado e indique si 
        //son mayores o menores de edad. Después de cada persona, el programa 
        //debe preguntarle al usuario si quiere seguir mostrando personas y 
        //frenar cuando el usuario ingrese la palabra “No”.
         Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese la cantidad de personas");
         int n = leer.nextInt();
        String[] nombres = new String[n];
        int[] edad = new int[n];
        CargaVectores(nombres, edad);
        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(edad));
        MayorMenor(nombres, edad);
        
    }
    public static void CargaVectores(String[] nombres, int[] edad){
        Scanner leer = new Scanner (System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingresar nombre de la persona: " + (i+1));
            nombres[i] = leer.next();
            System.out.println("Ingresar edad de la persona: " + (i+1));
            edad[i] = leer.nextInt();
        }
    }
     public static void MayorMenor(String[] nombres ,int[] edad){
          Scanner leer = new Scanner (System.in);
          String sn;
          boolean op = true;
            do {
              for (int i = 0; i < nombres.length; i++) {
              if(edad[i] >= 18){
                 System.out.println(nombres[i] + " es mayor de edad");
             }else{
                  System.out.println(nombres[i]+ " es menor de edad");
              }
              if(i < nombres.length){
                System.out.println("Desea continuar S/N");
                sn = leer.next();
              if(sn.equalsIgnoreCase("N")){
                  op = false;
              }
              }
             }
             
         } while (op);          
     }
}/*public static void mostrarDatos(String[] vectorCualquiera1, int[] vectorCualquiera2, Scanner leer) {
        String respuesta = "";
        do {
            for (int i = 0; i < vectorCualquiera1.length; i++) { // Recorremos el arreglo.
                //while (("SI".equals(respuesta))==true){
                if (vectorCualquiera2[i] >= 18) {
                    System.out.println((vectorCualquiera1[i]).toUpperCase() + ", de edad:" + vectorCualquiera2[i] + ". ES MAYOR DE EDAD");
                } else {
                    System.out.println(vectorCualquiera1[i] + ", de edad:" + vectorCualquiera2[i] + ". NO ES MAYOR UPSSSS");
                }

                if (i != vectorCualquiera1.length - 1) {//ESTO LO USO PARA QUE SOLO PREGUNTE, HASTA LA ULTIMA POSICION DEL VECTOR
                    System.out.println("");
                    System.out.println("Mostramos la siguiente persona??? SI / NO ");
                    respuesta = leer.next();//LEO RESPUESTA
                    respuesta = respuesta.toUpperCase();//LO CONVIERTO A MAYUSCULAS, para reducir errores
                } else {
                    System.out.println("NO HAY MAS DATOS PARA MOSTRAR");
                    respuesta = "NO";
                }
              // System.out.println("SI".equals(respuesta));
            }
        } while("SI".equals(respuesta));   // CONDICION LOGICA PARA VER SI SIGUE O NO MOSTRANDO DATOS
    }*/

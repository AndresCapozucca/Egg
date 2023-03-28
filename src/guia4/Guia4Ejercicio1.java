/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author SAMIR
 */
public class Guia4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //Crea una aplicación que le pida dos números al usuario y este 
        //pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación
        //debe tener una función para cada operación matemática y deben devolver 
        //sus resultados para imprimirlos en el main. 
            Scanner leer = new Scanner (System.in);
            int num1,num2;
            String sn ="N";
            System.out.println("Ingrese dos numeros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            do{
            System.out.println("Elija una funcion");
            System.out.println(" 1 -> Sumar\n " + " 2-> Restar\n " + " 3 -> Multiplicar\n " + " 4 -> Dividir\n" + "5 -> Salir");
            int menu = leer.nextInt();
            
            switch (menu){//selector de opciones de menu
                case 1:
                    System.out.println(suma(num1,num2));//impresiones de funciones
                    break;
                case 2:
                     System.out.println(resta(num1,num2));
                    break;
                case 3:
                    System.out.println(multiplicacion(num1,num2));
                    break;
                case 4:
                    if(num2 != 0){//si el numero es distinto que 0
                    System.out.println("La division es: " + division(num1,num2)); 
                }else
                        System.out.println("No se puede dividir por 0");
                    break;
                case 5:
                    System.out.println("Quiere Salir del Programa S/N");
                    sn = leer.next();
                    if ("S".equalsIgnoreCase(sn)) {//se comprueba la letra ingresada
                        System.out.println("Ha salido");
                    } else {
                        System.out.println("Continue navegando");
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta , Vuelva a Ingresar");
            }
            
    }while (!sn.equalsIgnoreCase("S"));//no se sale del menu hasta que se presiona "S"
            }
    public static int suma(int n1,int n2){//Funciones de operaciones matematicas.
        return n1+n2;
    }
    public static int resta(int n1,int n2){
        return n1-n2;
    }
    public static int multiplicacion(int n1,int n2){
        return n1*n2;
    }
    public static int division(int n1,int n2){
        return n1/n2;
    }
    }
    


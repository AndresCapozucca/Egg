/*Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
el carácter ‘S’ se sale del programa, caso contrario se vuelve
a mostrar el menú.
       MENU
     1-sumar    
     2-restar
     3-multiplicar  
     4-dividir
     5-salir
     Elija opcion:
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
public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese 2 numeros:");
        Scanner leer = new Scanner(System.in);
        int numero1 = leer.nextInt();        
        int numero2 = leer.nextInt();
        boolean op = true;
        while (op){
        System.out.println("Elija una opción"+"\n Menú"
               +"\n 1. Suma " + "\n 2. Resta"+
               "\n 3. Multiplicar"+"\n 4. Dividir" + "\n5 Salir");             
        String respuesta = leer.next();
           System.out.println("respuesta:  " + respuesta);
        switch (respuesta) {
            case "1":
                System.out.println("LA SUMA DE LOS NUMEROS INGRESADOS ES: " + 
                                       FuncionSumar(numero1,numero2));
                break; 
            case "2":
                System.out.println("LA RESTA DE LOS NUMEROS INGRESADOS ES: " + 
                                       FuncionRestar(numero1, numero2));
                 break;
            case "3":
                System.out.println("LA MULTIPLICACION DE LOS NUMEROS INGRESADOS ES: " +
                                       FuncionMultiplicar(numero1, numero2));
                 break;
             case "4":
                System.out.println("LA DIVISION DE LOS NUMEROS INGRESADOS ES: " +
                                       FuncionDividir(numero1, numero2));
                 break;
             case "5":
                System.out.println("A ELEGIDO LA OPCION SALIR, ESTA DE ACUERDO S/N" );
                String salir = leer.next();
               if (salir.equalsIgnoreCase("S")){
                   op=false;
               }else 
                     System.out.println("Volviendo al sistema.");
                 break;
            default:
                System.out.println("INGRESO UNA OPCION INCORRECTA");
        
    
        }
       }
    }

    public static int FuncionSumar(int num1,int num2) {
        int varAuxiliar; 
        varAuxiliar = num1 + num2;
        return varAuxiliar;
    }

    public static int FuncionRestar(int x, int y) {
        return x - y;
    }

    public static int FuncionMultiplicar(int x, int y) {
        return x * y;  
    }
     public static int FuncionDividir(int x, int y) {
        return x / y; 
    }

}


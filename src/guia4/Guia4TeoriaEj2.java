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
public class Guia4TeoriaEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
        //validando que el primer número múltiplo del segundo e imprima si el primer
        //número es múltiplo del segundo, sino informe que no lo son.
            Scanner leer = new Scanner (System.in);
            int num1,num2;
            System.out.println("Ingrese dos numeros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            EsMultiplo(num1,num2);
    }
     public static void EsMultiplo(int n1, int n2){
         if (n1 % n2 == 0){
             System.out.println("El numero "+ n1 +" es multiplo de " + n2 );
         }else
             System.out.println("El numero "+ n1 +" no es multiplo de " + n2 );
         }
     }


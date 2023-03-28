/*Leer la altura de N personas y determinar el promedio de estaturas 
que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general.
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
public class extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       double est,estGen,estInf,promEstGen,promEstInf;
       int auxGen,auxInf;
       estGen = 0;
       estInf = 0;
       auxGen = 0;
       auxInf = 0;
        System.out.println("Ingrese las estaturas que desea promediar,"
                + " utilice el numero 1 para dejar de ingresar datos.");
        est = leer.nextDouble();
        while (est != 1){
            estGen += est;
            auxGen++;
            if(est < 1.60){
                estInf+=est;
                auxInf++;
            }
        }
        promEstGen=estGen/auxGen;
        promEstInf=estInf/auxInf;
        System.out.println("La estatura de los " + auxGen
                + " individuos promedian en:" + promEstGen);
        System.out.println("La estatura de los " + auxInf 
                + "individuos que miden menos de 1,60mts promedian en:"
                +  promEstInf );
       
       
        
             
    }
    
}

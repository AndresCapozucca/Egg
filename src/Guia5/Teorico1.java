/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author 54358
 */
public class Teorico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea un vector llamado ‘Equipo’
        //cuya dimensión sea la cantidad de compañeros de equipo
        // y define su tipo de dato de tal manera que
        // te permita alojar sus nombres más adelante.
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String [6];
          String aux= "";
        for (int i=0;i<equipo.length;i++){
            System.out.println("Ingrese el nombre del compañero numero  "+(i+1)+ " :");
            equipo[i] = leer.next();
        }
        for (String elemento:equipo){
            aux += " \n "+ elemento;
        }
        System.out.println("**" + aux) ;
    }
    
}

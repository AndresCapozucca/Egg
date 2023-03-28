/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author 54358
 */
public class ej1katya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase= leer.nextLine();
        System.out.println("*" + transformacion(frase));        

    }
     public static String transformacion(String frase){
            String cambio_frase="";
        for (int i=0; i<frase.length();i++){
            String letra= frase.substring(i,i+1).toUpperCase();
            
            switch (letra){
                case "A":
                    letra="@";
                    break;
                case "E":
                    letra="#";
                    break;
                case "I":
                    letra="$";
                    break;
                case "O":
                    letra="%";
                    break;
                case "U":
                    letra="*";
                    break;
                default:
                    break;
            }
            
            cambio_frase=cambio_frase.concat(letra);
        } 
        return cambio_frase;
    }
    
}

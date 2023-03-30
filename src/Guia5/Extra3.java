/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author 54358
 */
public class Extra3 {

    /**
     *Crear una función rellene un vector con números aleatorios,
     * pasándole un arreglo por parámetro. Después haremos otra 
     * función o procedimiento que imprima el vector.

     */
    public static void main(String[] args) {
     int[]vector= new int[5];
     llenarvector(vector);
     mostrarvector(vector);
    }
    public static int[] llenarvector(int[]a){
        for (int i = 0; i < 5; i++) {
            a[i]= (int)(Math.random()*10);   
        }
        return a;
    }
    public static void mostrarvector(int[]u){
        String aux="";
        for(int recorrer : u){
            aux=aux+" "+recorrer;
        }
        System.out.print(aux + " - ");
            }
}

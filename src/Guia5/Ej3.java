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
public class Ej3 {

    /**                      EJERCICIO 3
        Recorrer un vector de N enteros contabilizando cuántos números
        son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);//ingresamos un scan para pedir el ingreso de la dimension
        System.out.println("Ingrese dimension del vector:");//mostramos el mensaje en pantalla
        int n = leer.nextInt();//definimos y al mismo tiempo ingresamos el valor de la dimension.
        int[] vector = new int[n];//Definimos y dimensionamos el vector.
        int una=0;
        int dos=0;
        int tres=0;      //Definimos variables para utilizar como contadores por cada respuesta a dar.
        int cuatro=0;
        int cinco=0;
        for (int i=0; i<n; i++){//Llenamos el vector con numeros aleatorios entre 1-99999 ya que necesitamos numero de entre 1 y 5 digitos.
            vector [i]= (int)(Math.random()*(1-99999)+99999);
                  System.out.println((i+1) + " - " + vector[i]); //imprimimos el vector
        }
       /* for (int i=0; i<n; i++){ //Recorremos el vector
              double x;
              double t;
              double r;  //Definimos una variable por cada digito.
              double w;
              double c;
              x = vector[i]/10; //empezamos a desarmar el numero y guardamos el resultado
              if (x<1){ // condicion logica si se cumple el numero tiene un solo digito ej: 4/10 = 0,4                     //VERSION UNO
                una++; //este es un contador para calcular cuantos numero de un digito hay dentro del vector.              
              }        
              t = x/10; // utilizamos el resultado anterios para continuar desarmando el numero. 
              if (t<1){ // condicion logica si se cumple el numero tiene dos digitos 
                dos++; //este es un contador para calcular cuantos numero de dos digitos hay dentro del vector.
              }
              r = t/10;
              if (r<1){//EN LA CONDICION LOGICA USAMOS "1" YA QUE SI UTILIZAMOS "0" EL NUMERO "0,N" SERA MAYOR A CERO.
                tres++; 
              }                           //REPETIMOS LO MISMO QUE LAS DOS PRIMERAS VECES 
              w = r/10;
              if (w<1){
                cuatro++; 
              }
              c = w/10;
              if (c<1){
                cinco++; 
              }
            }
              cinco= cinco- cuatro;
              cuatro= cuatro- tres;          //Las condiciones mas grandes se cumplen por mas que se cumplan las demas 
              tres= tres-dos;                //por lo tanto en estas lineas restamos las condiciones anteriores para llegar al resultado
              dos= dos-una;                  //osea el de 5 cifras cumple las condiones de todos, el de 4 las de el y las de los unferio
                                             // y asi consecutivamente.
             */                                
                                             
        for (int i = 0; i < n; i++) { //Recorremos el vector
            int cont = 0;//inicializamos el contador
            int v = vector[i] / 10;//Empezamos a desarmar el numero y guardamos el resultado
                cont++;//el contador dentro de este primer bucle siempe va a valer 1.
            int t = truncarnum(v);//Llamamos a la funcion para eliminar los decimales y lo guardamos en una nueva variable 
            for (int j = 0; j < 4; j++) {//En este bucle vamos a seguir desarmando el numero digito por digito 
                if (t > 0) { //utilizamos la nueva variable para definir cuando aumentamos el contador.                            
                    cont++;                                
                }                                         
                t = truncarnum(t / 10);//en esta linea realizamos la division y eliminamos el decimal al mismo tiempo                   
            }                                                                                                                //VERSION DOS
            switch (cont) {//segun el valor del contador vamos a tener las siguientes opciones                         
                case 1:    //si el contador vale uno significa que el numero era de un dig                               
                    una++; //este es un contador para calcular cuantos numero de un digito hay dentro del vector.
                    break;
                case 2:                                    //a tener en cuenta este listado se encuentra dentro del primer "for" y fuera del segundo.
                    dos++; //contador de dos digitos.      //esto para poder utilizar el valor final del contador. 
                    break;
                case 3:
                    tres++;//contador de tres digitos.
                    break;
                case 4:
                    cuatro++;//contador de cuatro digitos.
                    break;
                case 5:
                    cinco++;//contador de cinco digitos.
                    break;
            }
        }

       
        System.out.println("De los " + n + " numeros creados de forma aleatoria(1-99999) "
                + " y guardados dentro del vector tenemos \n *" + cinco + " numeros de "   //linea 100-104 imprime resultados para las dos versiones
                + "cinco cifras. \n *" + cuatro + " numeros de cuatro cifras. \n *"
                + tres + " numeros de tres cifras. \n *" + dos +" numeros de dos cifras."
                + "\n * " + una + " numeros de una cifra.");
        
        /*Scanner SC = new Scanner(System.in).useDelimiter("\n");
        int p,uno = 0,dos = 0,tres = 0,cuatro = 0,cinco = 0;

        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int[p = SC.nextInt()];
        for (int i = 0; i < p; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        for (int i = 0; i < p; i++) {
            System.out.println(vector[i] + " ");
        }
        for (int i : vector) {                                                   //VERSION 3
            String digitos = String.valueOf(i);
            switch  (digitos.length()) {
                case 1: uno++;
                        break;
                case 2: dos++;
                        break;        
                case 3: tres++;
                        break;
                case 4: cuatro++;
                        break;
                case 5: cinco++;
                        break;        
            }  
        }
        
        System.out.println("La cantidad de numeros de un digito fueron: " + uno);
        System.out.println("La cantidad de numeros de dos digitos fueron: " + dos);
        System.out.println("La cantidad de numeros de tres digitos fueron: " + tres);
        System.out.println("La cantidad de numeros de cuatro digitos fueron: " + cuatro);
        System.out.println("La cantidad de numeros de cinco digitos fueron: " + cinco);*/

}
     public static int truncarnum(double v){
        String strnum= v+"";//transformamos el numero a cadena
        int indice = strnum.indexOf("."); //buscamos el punto(".") dentro de la cadena y lo guardamos en la variable indice.                          
        int numtrunc=Integer.parseInt(strnum.substring(0, indice));//concatenamos desde la primer pocicion hasta el punto(".") 
        return numtrunc;//retornamos el numero concatenado convertido en entero.
         //La Funcion corresponde a la segunda version del ejercicio.
    }
}
/*Declarar cuatro variables de tipo entero A, B, C y D y 
asignarle un valor diferente a cada una. A continuación,
realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D 
y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable 
auxiliar.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;



/**
 *
 * @author 54358
 */
public class extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int A = (int) (Math.random() * 10);
    int B = (int) (Math.random() * 10);
    int C = (int) (Math.random() * 10);
    int D = (int) (Math.random() * 10);
        System.out.println(" A=  " + A + "\n B=  " + B + "\n C=  " + C +
                "\n D=  " + D );
    int aux = 0;
    aux = B;
    B = C;
    C = A;
    A = D;
    D = aux;
    
        System.out.println(" A=  " + A + "\n B=  " + B + "\n C=  " + C +
                "\n D=  " + D );
            
    }
    
}

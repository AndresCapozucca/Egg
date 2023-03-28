/*Una obra social tiene tres clases de socios:
--Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos.
--Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A.
--Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
sobre dichos tratamientos.
--Solicite una letra (carácter) que representa la clase de un socio,
y luego un valor real que represente el costo del tratamiento 
(previo al descuento) y determine el importe en efectivo 
a pagar por dicho socio.



*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author 54358
 */
public class extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio y a "
                + "continuacion valor del tratamiento.");
        String tipo = leer.next();
        int valor = leer.nextInt();
    switch (toUpperCase(tipo)){
        case "C":
            System.out.println("El Socio debe abonar $" + valor + ".");
            break;
        case "B":
            System.out.println("El socio debe abonar $" + ((valor*65)/100)
                    + ". (Incluye descuento del 35%)");
            break;
        case "A":
            System.out.println("El socio debe abonar $" + ((valor*50)/100) +
                    ". (Incluye descuento del 50%)");
            break;        
        default:
            System.out.println("Ingreso un tipo de cliente invalido.");
    }    
    }
    
}

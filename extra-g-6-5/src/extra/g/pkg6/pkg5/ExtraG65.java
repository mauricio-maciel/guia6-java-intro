/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.g.pkg6.pkg5;

import java.util.Scanner;

/**
 *Una obra social tiene tres clases de socios:
o
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 * @author Usuario
 */
public class ExtraG65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
      String clase; 
    do{ 
        System.out.println("ingrese la clase  de socio, a ,b, o c ");
         clase =leer.nextLine();
        System.out.println("ingrese el costo del tratamiento ");
         int costo=leer.nextInt();
        
        
        if(clase.equalsIgnoreCase("a")){
            double costoFinal=costo*0.50;
             System.out.println("el costo es "+costoFinal+" $ con 50% de descuento");
             continue;
        }if(clase.equalsIgnoreCase("b")){
            double costoFinal=costo*0.65;
            System.out.println("el costo es "+costoFinal+" $ con 35% de descuento");
            continue;
        }if(clase.equalsIgnoreCase("c")){
          double costoFinal=costo;
            System.out.println("el costo es "+costoFinal+" $ sin descuento");
            continue;
        }else{
            System.out.println("ingrese una clase valida");
            
        }
                
        
    }while(!clase.equalsIgnoreCase("a")||!clase.equalsIgnoreCase("b")||!clase.equalsIgnoreCase("c")); 
        
        
        
        
        
        
    }
    
}

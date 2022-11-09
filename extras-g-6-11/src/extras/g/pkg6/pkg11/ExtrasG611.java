/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.g.pkg6.pkg11;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 * @author Usuario
 */
public class ExtrasG611 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in); 
    
        System.out.println("ingrese un numero entero");
        int num=leer.nextInt();
        int cont=0;
        
       while(num>0){
           
           //num=num/10;
           //cont++;
           num=num-10;
              cont++;    
       }
        
        System.out.println("el numero de digitos es "+cont); 
    }
    
}

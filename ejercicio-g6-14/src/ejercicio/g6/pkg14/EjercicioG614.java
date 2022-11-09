/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.g6.pkg14;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 * @author Usuario
 */
public class EjercicioG614 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
        double euros;
        System.out.println("ingrese la cantidad de euros ");
        euros =leer.nextDouble();
        convertidor(euros);
        
        
        
        
    }
   public static void convertidor ( double euros){
       System.out.println("en libras es "+(euros*0.86)+"\n"+
       "en dolares es "+(euros*1.28611)+"\n"+
       "en yenes es "+(euros*129.852));
   } 
}

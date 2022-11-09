/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.g.pkg6.pkg10;

import java.util.Scanner;

/**
 *Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 * @author Usuario
 */
public class ExtrasG610 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer=new Scanner(System.in);
       
         
        int num1 = (int) (Math.random()*10);
        System.out.println("el numero 1 es "+num1);
        int num2 = (int) (Math.random()*10);
        System.out.println("el numero 2 es "+num2);
        int resultado=0;
        
        do {
            System.out.println("adivine el resultado de la multiplicacion");
             resultado = leer.nextInt();
         if((num1 * num2) == resultado){
             System.out.println("ha acertado");
         }else{
             System.out.println("numero incorrecto ingrese el valor nuevamente");
         }   
            
            

        } while ((num1 * num2) != resultado );
    
}
}
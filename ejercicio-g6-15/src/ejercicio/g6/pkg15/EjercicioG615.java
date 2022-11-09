/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.g6.pkg15;

/**
 *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * @author Usuario
 */
public class EjercicioG615 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int[] vector=new int[101]; 
        for(int i=0;i<101;i++){
            vector[i]=i;
        }
        for(int i=0;i<101;i++){
            System.out.println(vector[i]);
        }
        
    }
    
}

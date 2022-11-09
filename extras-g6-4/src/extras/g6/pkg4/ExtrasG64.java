/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.g6.pkg4;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 * @author Usuario
 */
public class ExtrasG64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer=new Scanner(System.in);
       int num=leer.nextInt();
        
        
       switch(num){
           case 1:
               System.out.println("el equivalente en numero romano es I");
               break;
           case 2:
               System.out.println("el equivalente en numero romano es II");
               break;
           case 3:
               System.out.println("el equivalente en numero romano es III");
               break;
           case 4:
               System.out.println("el equivalente en numero romano es IV");
               break;
           case 5:
               System.out.println("el equivalente en numero romano es V");
               break;
           case 6:
               System.out.println("el equivalente en numero romano es VI");
               break;
           case 7:
               System.out.println("el equivalente en numero romano es VII");
               break;
           case 8:
               System.out.println("el equivalente en numero romano es VIII");
               break;
           case 9:
               System.out.println("el equivalente en numero romano es IX");
               break;
           case 10:
               System.out.println("el equivalente en numero romano es X");
               break;
                      
           
       } 
        
        
    }
    
}

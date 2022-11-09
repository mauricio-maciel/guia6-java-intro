/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.g.pkg6.pkg7;

import java.util.Scanner;

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 * @author Usuario
 */
public class ExtrasG67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros a analizar");
        int n =leer.nextInt();
        double[]num = new double[n];
                
        for (int i = 0; i < n; i++) {
                System.out.println("ingrese un numero");
                num=leer
            
        }
        
        
        
    }
    
}

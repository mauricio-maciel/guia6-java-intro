/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.g.pkg6.pkg1;

import java.util.Scanner;

/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 * @author Usuario
 */
public class EjercicioG61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
2       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero de la suma ");
        num1=leer.nextInt();
        System.out.println("ingrese el segundo numero de la suma ");
        num2=leer.nextInt();
         
        System.out.println("el resultado de la suma es "+(num1+num2));
    }
    
}

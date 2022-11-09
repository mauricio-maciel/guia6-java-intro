/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.g.pkg6.pkg17;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos)
 * @author Usuario
 */
public class EjercicioG617 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el valor del vector");
        int n =leer.nextInt();
        int[]vector= new int[n];
        
        for (int i = 0; i < n; i++) {
            
            vector[i]=(int)(Math.random()*1000);
            System.out.println("["+vector[i]+"]");   
          }
        int unidad=0,decena=0,centena=0,mil=0,diezmil=0;
        
        for (int i = 0; i < n; i++) {
            
            if (vector[i]/10<10) {
                unidad++;
               if (vector[i]/100<100) {
                   decena++;
                  if (vector[i]/1000<1000) {
                      centena++;
                   if (vector[i]/10000<10000) {
                        mil++;
                     if (vector[i]/100000<100000) {
                          diezmil++;
                        
                
            }   
                
            }     
                
            }      
                
            }         
                
            }
               
          } 
        
        System.out.println("de 1 digito hay "+unidad);
        System.out.println("de 2 digito hay "+decena);
        System.out.println("de 3 digito hay "+centena);
        System.out.println("de 4 digito hay "+mil);
        System.out.println("de 5 digito hay "+diezmil);
        
    
    
    
    }
      
    
        
        
    }
    


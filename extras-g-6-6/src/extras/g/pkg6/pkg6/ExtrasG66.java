/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.g.pkg6.pkg6;

import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 * @author Usuario
 */
public class ExtrasG66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de personas a promediar ");
        int n=leer.nextInt();
        double[] alt=new double[n];
        
        int cont=0;
        double suma160=0;
        double sumaAlt=0;
        for (int i = 0; i < n ; i++) {
          
            System.out.println("ingrese la altura a promediar");
             
              alt[i]=leer.nextDouble();
            
        }
        for (int i = 0; i < n ; i++) {
              System.out.println("calculo de promedio de altura");
             
               sumaAlt = sumaAlt + alt[i];
             
            }
            double promedioalt=sumaAlt/n;
        for (int i = 0; i < n ; i++) {
           if(alt[i]<1.60){
            System.out.println("calculo de promedio por debajo de 1.60 ");
             
               suma160= suma160 + alt[i] ; 
              cont++;
            
        }
               
    }
        double promedio160 =suma160/cont ;
    System.out.println("el promedio de altura es "+promedioalt+" de "+n+" personas");   
    System.out.println("el promedio debajo de 1.60 es "+promedio160+" de "+cont+" personas");
}
}

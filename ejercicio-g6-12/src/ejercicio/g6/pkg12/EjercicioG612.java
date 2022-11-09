/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.g6.pkg12;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 * @author Usuario
 */
public class EjercicioG612 {

    /**substring(int beginIndex, int
           endIndex)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner leer =new Scanner(System.in);
    
        String mensaje;
        int correcto=0,incorrecto=0; 
        do{
            System.out.println("ingrese el mensaje de 5 caracteres maximo"); 
            System.out.println("el primer carcter debe ser x y el ultimo debe ser o");
            mensaje = leer.nextLine();
           
            
            if (( mensaje.length()==5)&&( mensaje.substring(0,1).equalsIgnoreCase("x"))&&(mensaje.substring(4,5).equalsIgnoreCase("o"))){
              System.out.println("contiene mas o menos 5 caracteres");
              System.out.println("el mensaje es valido");
                   correcto ++;
            }else if(mensaje.equals("&&&&&")){ 
                System.out.println("esta saliendo del programa");
               break;     
            
            }else{
              System.out.println("hay una falla en el primer o el ultimo caracter");
              System.out.println("el mensaje es invalido");
                   incorrecto++;
            
            
            
                    }
             
        }while(!mensaje.equals("&&&&&"));
        System.out.println("el numero de ingresos correctos son "+ correcto);
        System.out.println("el numero de ingresos incorrectos son "+incorrecto);
    }
    
}

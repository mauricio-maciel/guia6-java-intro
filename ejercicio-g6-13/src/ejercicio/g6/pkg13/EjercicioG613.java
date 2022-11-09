/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.g6.pkg13;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 * @author Usuario
 */
public class EjercicioG613 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      String[][] array = new String[4][4];
        
      for(int i = 0;i < 4; i++){  
        for(int j = 0; j < 4; j++){  
        if((i>0)&&(j>0)&&(i<3)&&(j<3)){  
          array[i][j] = ("   ");
        }else{
          array[i][j] = (" * ");   
                }
                }
          }         
      for(int i = 0; i < 4; i ++){  
          for(int j = 0; j < 4; j++){  
            
              System.out.print(array[i][j]);
            }
          System.out.println(" ");   
      }  
        
        
    }
}


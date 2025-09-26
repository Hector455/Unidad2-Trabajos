/*
Este programa pide nombres, descartando los repetidos al precionar salir 
este imprime cuantos nombres diferentes se ingresaron
Hector Alejandro Hernandez 23/09/2025
 */
package reto1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Pregunta11 {
     public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> d1 = new ArrayList<>();
       Scanner leer = new Scanner(System.in);
       String checar;
    
       do {
           System.out.println("Dame un nombre");
           checar=leer.nextLine();
            boolean bandera=false;
           for (String elemento : d1) {
               if (elemento.equalsIgnoreCase(checar)){
                   bandera=true;
                   break;
               }
               
           }
           if(!bandera){
               d1.add(checar);
           }
           
           
         
           
        
           
           
       }
       while (!checar.equalsIgnoreCase("salir"));
         System.out.println("la cantidad de nombres es "+(d1.size()-1));
        
    }
}

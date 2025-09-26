/*
Dado un arreglo numerico definido el programa identifica cuaal es el  mayor recorriendo todos los 
espacios imprimiendo cual es el mayor y en que posicion esta
Hector Alejandro Hernandez 23/09/2025
 */
package reto1;

/**
 *
 * @author LENOVO
 */
public class Pregunta16 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[]x={3,2,8,6,3,7,3,1,40,-2,4};
        int z=0;
        int x1=0; 
        for (int i = 0; i <11; i++) {   // recorremos solo los productos ingresados
             
               if (x[i]>z){
                   z=x[i];
                   x1=i;
               }
              
           }
        System.out.println("el mayor es "+z);
        System.out.println(" posicion "+x1);
    }
    
}

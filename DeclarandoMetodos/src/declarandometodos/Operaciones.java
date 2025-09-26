/*
clase donde se encuentran los metodos de las operaciones 
 */
package declarandometodos;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Operaciones {
    
    
   public static String saludoMayus(String nombre) {
    nombre = nombre.toUpperCase();           // guardar el resultado
    String saludo = "¡" + nombre + " Hola!"; // construir el saludo
    return saludo;
}
     public static int incrementar(int num){// suma 1 al numero que le des
         return num+1;
         
     }
    public static int Sumar(int num1, int num2){ // suma dos numeros que ingreses
        return num1+num2;
        
    }
    public static int Sumar(int num1, int num2,int num3){ // suma 3 numeros que ingrese  
        return num1+num2+num3;
        
    }
    public static boolean comparar(int n1, int n2){ // compara dos numeros para ver si son verdadero o falso
        if (n1==n2){
            return true;
        }
        else {
            return false;
        }
    }
    
     
}

/*
clase donde estan los metodos que se mandan a llamar a menu
 */
package reto2;

/**
 *
 * @author LENOVO
 */
public class metodos {
    public static String parInpar(int numero){
        if (numero%2==0){
            return "Par";
        }
        else {
            return "Inpar";
        }
    }
    public static String esPrimo(int numero){
     String valor = "es primo";
      for(int i=2;i<numero-1;i++){
           if(numero%i==0){
               valor= "no es primo";
           }
      }
      return valor; 
}
public static int suma(int numero){
    int numero2=0;
     String cadena= ""+numero;
      for(int i = 0; i<cadena.length();i++){
         numero=(int)cadena.charAt(i)-'0';
            numero2 =numero+numero2;
      }
      return numero2;
}

    
}

/*
Este programa saca el factorial de un numero
Hector Alejandro Henandez Velaaco 01/10/2015
 */
package reto3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero a leer ");
        int x = sc.nextInt();
        System.out.println("el factorial es "+factorial1(x));
    }
  public static double factorial(double n) {// metodo del factorial
        if (n == 0 || n == 1) {
            return 1;  // en estos caso no necesita recursividad
        } else {
            return n * factorial(n - 1); // llama hasta que llegue a 1 
        }
    }
  public static double factorial1(int n){ // este metodo es con ciclos
       double fac=1;
    for (int i = n; i >= 1; i--) {
           
                   fac= fac* i;  // multiplicamos el acumulador por i
        }
    return fac;
  }

    
    
}

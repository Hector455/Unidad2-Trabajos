/*
 Clase principal.
este programa valida un numero y con los metodos regresa  si es par, el cuadrado, 
el cubo, la suma de los dijitos y si es primo
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ValidadorDeNumero {
   public static void main(String[] args) { // metodo principal
        // Aquí va la lógica del programa
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("ingrese numero ");
            i=sc.nextInt();
            System.out.println("El numero es "+metodos.parInpar(i));
            System.out.println("el cuadrado de el numero es "+Math.pow(i, 2));
            System.out.println("El cubo de de el numero es "+Math.pow(i, 3));
            System.out.println("la suma de los dijitos es "+metodos.suma(i));
            System.out.println("el numero  "+metodos.esPrimo(i));
            
        }while (i!=0);
        
    }
}

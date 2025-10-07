/*
 programa que pide 10 numeros y regresa la suma de los numeros ingresados 
Hector Alejandro Hernandez Velasco 06/10/2025
 */
package tareaSuma;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class sumaRecursiva { 
   static int[] x = new int[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESARA 10 NUMEROS PARA SUMAR:");
        
        for (int i = 0; i < 10; i++) {// aqui se ingresan los numeros al arreglo
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }

       
        System.out.println("La suma total es: " + suma(0)); // aqui se llama al metodo por primera vez
    }

    static int suma(int b) { // metodo recursivo
        if (b == x.length - 1) { // caso  última posición
            return x[b];
        } else { // caso recursivo
            return x[b] + suma(b + 1);
        }
    }
    
}

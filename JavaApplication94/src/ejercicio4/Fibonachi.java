/*
programa que simula un fimonnaci
hector alejandro hernandez velasco 03/10/2025
 */
package ejercicio4;

/**
 Resuelve un fibonnaci
 * Hector Alejandro Hernandez 03/10/2025
 */
public class Fibonachi {
    public static void main(String[] args) {
        int n = 12; // aqui se puede modificar el fimonnaci
        System.out.print("Serie de Fibonacci: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonnaci(i) + " ");
        }
        System.out.println("");
        System.out.println("En un año serian: "+fibonnaci(n)+ " parejas de cojnejos");
    }

    public static long fibonnaci(long x) {
        if (x == 1 || x == 2) {
            return 1; // los dos primeros términos son 1
        } else {
            return fibonnaci(x - 1) + fibonnaci(x - 2);
        }
    }
}
// tarea que imprima la serie
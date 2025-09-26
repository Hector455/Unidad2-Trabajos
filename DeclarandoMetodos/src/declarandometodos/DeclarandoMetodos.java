/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package declarandometodos;

import java.util.Scanner;

/**
 rograma que segun lo que quiera el usuario saluda incrementa un numero suma dos o 3 numeros
 * o compara
 * Hector Alejandro Hernandez 25/09/2015
 */
public class DeclarandoMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // metodo principal donde esta el menu
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int elec;
        
        do{
            System.out.println("1. Mandar saludo");
            System.out.println("2. Incrementar");
            System.out.println("3 Sumar 2 numeros");
            System.out.println("4 Sumar 3 numeros");
            System.out.println("5 comparar");
            System.out.println("6 salir");
            elec=leer.nextInt();
            leer.nextLine();
        switch (elec) {
            
    case 1:
        // llama metodo saludo
        System.out.println("ingrese nombre ");
        String nombre =leer.nextLine();
        System.out.println(Operaciones.saludoMayus(nombre));
        break;
    case 2:
        // llama metodo incrementar
        System.out.println("ingrese numero  ");
        int num= leer.nextInt();
        System.out.println(Operaciones.incrementar(num));
        break;
    case 3:
        //llama metodo sumar 
        System.out.println("ingrese primer numero ");
        int num1= leer.nextInt();
        System.out.println("ingrese segundo numero ");
        int num2= leer.nextInt();
        System.out.println("resultado es "+Operaciones.Sumar(num1, num2));
        break;
    case 4:
        // llama metodo sobrecargado sumar pero este suma 3 numeros
        System.out.println("ingrese primer numero ");
        int nun1= leer.nextInt();
        System.out.println("ingrese segundo numero ");
        int nun2= leer.nextInt();
        System.out.println("ingrese tercer numero ");
        int nun3 = leer.nextInt();
        System.out.println("resultado es "+Operaciones.Sumar(nun1, nun2,nun3));
     
        break;
    case 5:
        // llama metodo comparar 
        System.out.println("ingrese primer numero ");
        int n1= leer.nextInt();
        System.out.println("ingrese segundo numero ");
        int n2 = leer.nextInt();
        System.out.println(Operaciones.comparar(n1, n2));
        break;
        
}
            System.out.println("--------------------------------");
            
        }while (elec!=6);// siclo del menu
        
    }
    
}

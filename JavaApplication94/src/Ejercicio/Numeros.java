/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Numeros {
    public static void main(String[] args) {
       num(10);
       
    }
    public static void num(int x){
        int n=1;
     if (x>=0){
         
         System.out.println(x);
         num(x-1);
         
     }
   
    }
}

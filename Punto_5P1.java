/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial_1;

/**
 *
 * @author Armando Bautista
 */
import java.util.Scanner;
public class Punto_5P1 {
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
    
        
        System.out.println("digite la longitud del la piramide de los asteriscos");
        int alt=teclado.nextInt();
        
        
        for(int i=alt;i>0;i--){
        for(int d=0;d<alt-1;d++){
        
            System.out.println("");
        }
        
        for(int a=0;a<alt;a++){
            System.out.println("*");
        
        
        }
        System.out.println("");
        }
        for(int c=2;c<alt;c++){
        for(int e=0;e<alt-1;e++){
        
            System.out.println("");
        }
        
        for(int t=0;t<alt;t++){
            System.out.println("*");
        
        
        }
         System.out.println("");
        }
    }
}

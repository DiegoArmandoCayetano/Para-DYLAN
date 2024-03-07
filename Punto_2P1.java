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
public class Punto_2P1 {
    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Digite un palabra para determinar cuantas vocales y consonantes tiene");
        String palabra=teclado.nextLine().toLowerCase();
        
        
        int vocales=0;
        int consonantes=0;
        
        for (int i =0;i<palabra.length();i++){
        char verif=palabra.charAt(i);
        
        if(verif=='a'||verif =='e'||verif=='i'||verif=='o'||verif=='u'){
            
            vocales++;
        }
        else{
        
        consonantes++;
            }
        }
        
        System.out.println("La cantidad de vocales en su palabra es de '"+vocales+"' vocales");
        System.out.println("La cantidad de consonantes en su palabra es de '"+consonantes+"' vocales");
    }
    
}

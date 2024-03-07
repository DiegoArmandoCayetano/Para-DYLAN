/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial_1;

import java.util.Scanner;

/**
 *
 * @author Armando Bautista
 */
public class Punto_1P1 {


    public static void main(String[] args) {
        
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Digite un numero para determinar su valor factorial");
        int numero= teclado.nextInt();
        
        
        double num_factorial=1;
        
        if(numero==0 || numero<0){
            System.out.println("No se puede calcular el numero factorial de un numero igual o menor a '0'");
           }
        
        
        
        
        else{
        for(int i=1;i<=numero;i++){
        num_factorial=num_factorial*i;
        
        }
        
            System.out.println("El valor factorial del numero es de "+num_factorial);
        }
    }
}



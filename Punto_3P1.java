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
public class Punto_3P1 {
    
    public static void main(String[] args) {
        
       Scanner teclado=new Scanner(System.in);

       
      double  serie=0;
       double acumulado=1;
    double total=0;
 System.out.println("calcular la suma de la serie `1 + 1/2 + 1/3 + ... + 1/n`. Digita un numero entero diferente de 0 para 'n'");
        int numero=teclado.nextInt();
        
        
        if(numero==0){
            System.out.println("Digite un numero diferente de 0, (no se hacepta division por 0)");
        }
        else{
            
            while(acumulado<=numero){
       serie=1/acumulado;
       acumulado++;
       total+=serie;
         
                }
        }
        
               System.out.println("El valor de la serie es de "+total);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaprogra1;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class TareaProgra1 {

    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre;
       double cantidad;
       double resultado;
       int opcion;
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Introduzca  su nombre: ");
       nombre = sc.nextLine();
       System.out.println("Introduzca una cantidad : ");
       cantidad = sc.nextDouble();
       
           System.out.println("1. Euros.");
           System.out.println("2. dorales.");
           System.out.println("3. Yuanes.");
           
            
           System.out.println("¿A qué desea convertirlo?");
           opcion = sc.nextInt();
           
           switch(opcion){
               case 1:
                   resultado = cantidad * 9.13;
                   System.out.println("El resultado es: " + resultado);
                   break;
               case 2:
                    resultado = cantidad * 7.00;
                   System.out.println("El resulto es: " + resultado);
                   break;
                case 3:
                   resultado = cantidad * 1.00;
                   System.out.println("El resulto es: " + resultado);
                   break;
                
           
            
       }
    }
    
    
   
}

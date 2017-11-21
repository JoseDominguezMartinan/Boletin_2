/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args) {
        // TODO code application logic here
        
        float cambio, euros, dolares ;
           Scanner sc = new Scanner(System.in); // crear clase de tipo escaner para la insercion de datos, si no nos coge la clase scanner nos sale un icono en el numero de la linea, clicamos y damos en la primera opcion
           System.out.print("ingrese la cantidad que quiere convertir"); // insertamos un mensaje de salida para que el usuario sepa que debe insertar
           euros=sc.nextFloat(); // pide un dato y lo mete en la variable euros
          System.out.print("ingrese el valor del euro al cambio en dolares"); // mensaje de salida para que el usuario sepa que debe insertar
           cambio=sc.nextFloat(); // insertamos el valor al que esta el cambio
        dolares=cambio*euros; // realizamos la operacion que queremos quitar por pantalla
        System.out.println(euros+" euros son "+dolares+" dolares"); // visualizamos la informacion por pantalla 
        
        
                
        
        
    }
    
}

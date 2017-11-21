/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float numero1, numero2; // variables de los dos numeros con los que queremos operar
        Scanner sc = new Scanner(System.in); // definimos a clase para a inserccion de datos por teclado 
        System.out.print("inserte el primer numero con el que desea operar "); // mensaxe para o usuario
        numero1=sc.nextFloat(); // inserccion do valor do primeiro numero por teclado
        System.out.print("inserte el segundo numero con el que desea operar "); // mensaxe para o usuario
        numero2=sc.nextFloat(); // insercion do valor do segundo numero por teclado 
        System.out.print
                        (" a suma de estos dous números é"+ (numero1+numero2)+  
                        "\n a resta de estos dous números é"+(numero1-numero2)+ "\n "+
                        "o producto destos dous números é "+numero1*numero2+ "\n"+
                        " o cociente destos dous números é "+numero1/numero2 ); // \n e para facer o salto de linea pode ir dentro ou fora do literar
        
        
       
        
        
        
    }
    
}

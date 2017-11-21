/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float prezoTarifa, prezoPagado;
        Scanner sc=new Scanner(System.in);
        System.out.println("inserte o prezo da prenda");
        prezoTarifa=sc.nextFloat();
        System.out.println("inserte o prezo pagado pola prenda");
        prezoPagado=sc.nextFloat();
        System.out.println("o desconto da prenda é de"+((prezoTarifa-prezoPagado)/prezoTarifa*100)+" %");
        
        
        
    }
    
}

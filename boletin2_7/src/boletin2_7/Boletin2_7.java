/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float gradosCentigrados;
        Scanner sc=new Scanner(System.in);
        System.out.println("inserte a temperatura en grados centigrados que quere convertir");
        gradosCentigrados=sc.nextFloat();
        System.out.println(gradosCentigrados+"ºC son "+(gradosCentigrados*33.8)+" grados Fahereint"+" e "+(gradosCentigrados*274.15)+" Kelvin");
        
    }
    
}

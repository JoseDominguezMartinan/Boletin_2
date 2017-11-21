/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Cantidade 
{
    int diñeiro,un,cinco,vinte,cen,resto;
    public void calcular()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce a cantidade de diñeiro que queres convertir");
        diñeiro=sc.nextInt();
         cen=diñeiro/100;
        resto=diñeiro%100;
        vinte=resto/20;
        resto=resto%20;
        cinco=resto/5;
        un=resto%5;
        System.out.println("temos:\nBilletes de cen "+cen+" \n"+"Billetes de vinte "+vinte+" \n"+"Billetes de cinco "+cinco+"\n"+"moedas de euro "+un);
    }
}

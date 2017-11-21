/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class cambioDivisa {
    
    public void cambio()
    {
        int cinco,vinte,cen,un,diñeiro;
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce a cantidade de billetes de cinco");
        cinco=sc.nextInt();
        System.out.println("introduce a cantidade de billetes de vinte");
        vinte=sc.nextInt();
        System.out.println("introduce a cantidade de billetes de cen");
        cen=sc.nextInt();
        System.out.println("introduce a cantidade de moedas de un");
        un=sc.nextInt();
        
        diñeiro=(cinco*5)+(vinte*20)+(cen*100)+(un*1);
        System.out.println("o credito é de "+diñeiro);
                
    }
    
}

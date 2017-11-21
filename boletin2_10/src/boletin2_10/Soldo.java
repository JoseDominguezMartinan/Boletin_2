/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Soldo {
    double fixo,ventas,kilometraxe,bruto,neto;
     int dias;
    Scanner sc=new Scanner(System.in);
    public void calcularSoldo()
    {
       System.out.println("Inserta o salario base do empregado");
       fixo=sc.nextDouble();
       System.out.println("Inserta o importe das  ventas do empregado");
       ventas=sc.nextDouble();
       System.out.println("Inserta o numero de kilometros percorridos polo empregado");
       kilometraxe=sc.nextDouble();
       System.out.println("Inserta o numero de dias que estivo desprazado o empregado");
       dias=sc.nextInt();
       
       bruto=fixo+(ventas*0.05)+(kilometraxe*2)+(dias*30);
       neto=bruto-(bruto*0.18)-36;
        System.out.println("o soldo neto do xogador é "+neto);
    }
    
}

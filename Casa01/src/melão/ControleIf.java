/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melão;

import java.util.Scanner;


/**
 *
 * @author UEPA-LAB6-PC07
 */

public class ControleIf {
    
    public static void main (String[] args){
        int valor1;
        int valor2;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o valor 1");
                valor1=input.nextInt();
        System.out.println("Digite o valor 2");
                valor2 = input.nextInt();
        if (valor1 > valor2){
        System.out.println("O valor inicial é maior que o valor final");
    }
        else if (valor1 < valor2){
            System.out.println("O valor inicial é menor que o valor final");
            }else {
            System.out.println("O valor inicial é igual o valor final");
            }
    }
}

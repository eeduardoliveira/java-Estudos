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
public class ControleSwitch {
    public static void main  (String[] args){
        Scanner pow = new Scanner(System.in);
        System.out.println("Insira um valor ");
        int valor = pow.nextInt();
        
        switch(valor){
            case 1: System.out.println(" Opção 1");break;
            case 2: System.out.println(" Opção 2");break;
            case 3: System.out.println(" Opção 3");break;
            case 4: System.out.println(" Opção 4");break;
            default: System.out.println("O valor é maior que 4");break;
        }
        
    }
    
}

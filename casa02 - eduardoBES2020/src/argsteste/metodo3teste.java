/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argsteste;

import java.util.Scanner;

import args.metodo3;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class metodo3teste {
    public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
    metodo3 mte = new metodo3();
    System.out.println("Informe seu nome: ");
    String nome = input.nextLine();
    mte.display(nome);
    
    
    }
    
}

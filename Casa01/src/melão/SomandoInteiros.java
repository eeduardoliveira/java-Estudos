/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melão;

import java.util.Scanner;// Apropriando de uma classe da biblioetaca jdk

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class SomandoInteiros {
    
    public static void main (String[] args){
    //Cria um Scanner, para obter entrada de usuário
    Scanner entrada = new Scanner (System.in);
    int num1;
    int num2;
    int resultado;   
    
    System.out.println("Entre com o primeiro número: ");
    num1=entrada.nextInt(); //Lê o primeiro  numero fornecido pelo usuário
    System.out.println("Entre com o segundo número: ");
    num2=entrada.nextInt(); 
    
    
    resultado=num1+num2;
    
    System.out.println("Resultado da Soma: "+resultado);
    }
    
}

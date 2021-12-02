/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argsteste;

import java.util.Scanner;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class MetodoMatematica {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    //solicita os três valores
    System.out.println("Insira dois valores: ");
    double numero1= input.nextDouble();
    double numero2= input.nextDouble();
    
    //determinar o valor máximo
    double resultadoMaximo = Math.max(numero1, numero2);
    double resultadoMinimo = Math.min(numero1, numero2);
    double resultadoAbsoluto = Math.abs(numero1);
    double resultadoPotencia = Math.pow(numero1, numero2);
    double resultadoRaizQuadrada = Math.sqrt(numero1);
    System.out.println("Valor máximo é: "+resultadoMaximo);
    System.out.println("Valor minimo é: "+resultadoMinimo);
    System.out.println("Valor absoluto é: "+resultadoAbsoluto);
    System.out.println("Numero 1 elevado ao numero 2: "+resultadoPotencia);
    System.out.println("Raiz quadrada é: "+resultadoRaizQuadrada);
}
    }
    

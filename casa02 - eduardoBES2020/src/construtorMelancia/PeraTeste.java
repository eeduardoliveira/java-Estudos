/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtorMelancia;

import java.util.Scanner;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class PeraTeste{
    public static void main(String[] args){
    pera pr1 = new pera(50.0);
    pera pr2 = new pera(-7.53);
    
    System.out.println("Objeto 1 Saldo: "+pr1.getSaldo());
    System.out.println("Objeto 2 Saldo: "+pr2.getSaldo());
    //Entrada
    Scanner input = new Scanner (System.in);
    System.out.println("Entre com a quantia para deposito no Obj1");
    double quantiadeposito1=input.nextDouble();
    System.out.println("Entre com a quantia para deposito no Obj2");
    double quantiadeposito2=input.nextDouble();
    System.out.println("Saldo conta: "+quantiadeposito2);
    
    pr1.credito(quantiadeposito1);//Adiciona o saldo no obj1
    pr2.credito(quantiadeposito2);//Adiciona o saldo no obj2
    //exibe os saldos
    System.out.println("Saldo 1 "+pr1.getSaldo());
    System.out.println("Saldo 2 "+pr2.getSaldo());
}

}
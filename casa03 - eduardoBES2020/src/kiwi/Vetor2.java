/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiwi;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class Vetor2 {
    public static void main(String[] args){
        int[] vetor={32, 27, 64, 18, 95, 14};
        //vetor.length determina o comprimento do vetor
        System.out.println("index, value");
        
        for (int contador=0; contador < vetor.length; contador++){
            System.out.printf("%d \t \n", contador, vetor[contador]);
        }
    }
} 
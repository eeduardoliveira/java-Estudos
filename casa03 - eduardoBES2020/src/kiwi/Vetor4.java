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
public class Vetor4 {
     public static void main(String[] args){
        int[] vetor=[87, 68, 94, 100, 78]; // cria o array
        int total=0;
        
        //vetor.length determina o comprimento do vetor
        for(int contador=0; contador < vetor.length;contador++){
            total += vetor[contador];
            System.out.println("processo de soma dos elementos do vetor "+total);
        }
         System.out.println ("total do vetor: "+total);
        
    }
}

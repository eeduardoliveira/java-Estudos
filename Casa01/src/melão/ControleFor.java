/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melão;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class ControleFor {
    
    public static void main (String [] args){
        int total = 0;
        for(int numero = 2; numero < 10; numero +=2){
        total+=numero;
        
        System.out.println("resultado da soma: "+total); //+ aqui se comporta para concatenar

                }
    
}
}
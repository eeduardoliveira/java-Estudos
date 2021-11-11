/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banana;

import java.util.Scanner;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class LaranjaMecanica {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    laranja lj = new laranja(); // new - palavra reservada para instanciar o obj e em seguida do nome do construtor. 
    
   
    System.out.println("O nome do curso inicialmente é:  "+lj.getNomecurso());
    
    System.out.println("Informe o nome do curso: ");
    String onome=input.nextLine();
    lj.setNomecurso(onome);
    System.out.println();
    lj.display(); 
    
    }
    
    
    }
    


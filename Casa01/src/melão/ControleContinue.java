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
public class ControleContinue {
        public static void main (String [] args){
        int contador;
        for(contador= 1;contador < 6;contador++){
        if(contador==4)
            continue;
          System.out.println(contador);
                }
            System.out.println("pula o valor 4");
            
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtorMelancia;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class pera {
    private double saldo;
    
    public pera(double saldoinicial) {
       if(saldoinicial > 0.0){
           saldo=saldoinicial;
       }
    }
    
    public void credito(double quantia){
        saldo= quantia + saldo;
    }
    public double getSaldo(){
        return saldo;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banana;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class Methods1 {
    
    void metodoUm(){
    System.out.println("Metodo sem argumentos");
    }
    int metodoDois(){
    int valor1=10 , valor2=13;
    int total = valor1 * valor2;
    return total;
    }
    double metodoTres(int arg1, int arg2){
    double total;
    total=(double)arg1/(double)arg2;
    return total;
    }
    public static void main (String [] args){
        Methods1 mt1 = new Methods1();
        mt1.metodoUm();
        System.out.println(mt1.metodoDois());
        double total=mt1.metodoTres(100, 5);
        System.out.println(""+total);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banana;

import javax.swing.JOptionPane;

/**
 *
 * @author UEPA-LAB6-PC07
 */
//public class Dialogo1 {
//    public static void main(String[] args){
//    JOptionPane.showMessageDialog(null,"\nProgramação Orientado a Objeto II");
//    }
//}

public class DialogoEntrada {
    public static void main(String[] args){
       String nome = JOptionPane.showInputDialog("Qual é seu nome?");
       
       //cria mensagem
       String mensagem = String.format("Bem vindo %s ao curso de java", nome);
       
       //Exibe Mensagem
       JOptionPane.showMessageDialog(null, mensagem);
    }
}
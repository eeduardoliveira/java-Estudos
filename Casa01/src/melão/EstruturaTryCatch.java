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
public class EstruturaTryCatch {
  public static void main(String [] args){
    int valor = 120;
    
    try // caso ocorra exceção, automaticamente desvia para o catch
      {
        while(valor>Integer.parseInt(args[0])){ //Integer.parseInt força a ser um numero Inteiro
        System.out.println(valor);
              valor--;
          }
      }
    catch(ArrayIndexOutOfBoundsException erro){
        System.out.println("Você não forneceu o argumento");
        }
    catch(NumberFormatException erro){
        System.out.println("Você não forneceu um numero inteiro");
      
         }
  }
}
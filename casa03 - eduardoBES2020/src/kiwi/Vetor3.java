package kiwi;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class Vetor3 {
     public static void main(String[] args){
        int elementos=5;
        int[] vetor= new int[elementos]; // cria o array
        int contador;
        
        //vetor.length determina o comprimento do vetor
        for(contador=0; contador < vetor.length;contador++){
        vetor[contador]= 2 + ( 2 * contador);
            System.out.println("index, value");
        }
        
        //gera a saida do valor de cada elemento array
        for (contador=0; contador < vetor.length; contador++){
            System.out.printf("%d \t \n", contador, vetor[contador]);
        }
    }
}
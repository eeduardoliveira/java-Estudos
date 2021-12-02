/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtorMelancia;

import banana.*;

/**
 *
 * @author UEPA-LAB6-PC07
 */
public class laranja { //setgetExercicio
   
    private String nomecurso;
    
    public laranja (String nome) {
        nomecurso=nome;
    }
   
    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
    
    public void display(){
    System.out.println("Seja bem vindo ao curso "+getNomecurso());
    }
}
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
public class setgetExercicicio {
    
    private String nomecurso;
    
    
    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
    
    public void display(){
    System.out.println("Seja bem vindo ao curso "+nomecurso);
    }
    
}

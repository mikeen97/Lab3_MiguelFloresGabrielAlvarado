/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelfloresgabrielalvarado;

import java.awt.Color;

/**
 *
 * @author Gabriel Alvarado
 */
public class Arañas extends Bestias
{
 private String sexo;
 private String life;

 public Arañas(){
     super();
 }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }
 
    public Arañas(String sexo, String life) {
        this.sexo = sexo;
        this.life = life;
    }

    public Arañas(String sexo, String life, int Guarras, String veneno, int vida, int curacion, int Ataque) {
        super(Guarras, veneno, vida, curacion, Ataque);
        this.sexo = sexo;
        this.life = life;
    }

    @Override
    public String toString() {
        return "Ara\u00f1as{" + "sexo=" + sexo + ", life=" + life + '}';
    }

  

    
 
}

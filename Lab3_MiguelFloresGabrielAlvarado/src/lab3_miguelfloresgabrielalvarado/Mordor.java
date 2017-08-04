/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelfloresgabrielalvarado;

/**
 *
 * @author Gabriel Alvarado
 */
public class Mordor extends Lugares{
    private int guardianes=4;

    public Mordor() {
        super();
    }

    public Mordor(String Extencion, int integrantes) {
        super(Extencion, integrantes);
    }

    public int getGuardianes() {
        return guardianes;
    }

    public void setGuardianes(int guardianes) {
        this.guardianes = guardianes;
    }

    @Override
    public String toString() {
        return "Mordor{" + "guardianes=" + guardianes + '}';
    }

   
    
    
}

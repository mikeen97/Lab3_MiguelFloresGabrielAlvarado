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
public class Gondor extends Lugares{
    private int paraje;
    public Gondor(){
        super();
    }

    public Gondor(int paraje) {
        this.paraje = paraje;
    }

    public Gondor(int paraje, String Extencion, int integrantes) {
        super(Extencion, integrantes);
        this.paraje = paraje;
    }

    public int getParaje() {
        return paraje;
    }

    public void setParaje(int paraje) {
        this.paraje = paraje;
    }

    @Override
    public String toString() {
        return "Gondor{" + "paraje=" + paraje + '}';
    }

    

    
    
}

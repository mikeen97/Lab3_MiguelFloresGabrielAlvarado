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
public class Comarca extends Lugares {

    private int poder;

    public Comarca() {

    }

    public Comarca(int poder) {
        this.poder = poder;
    }

    public Comarca(int poder, String Extencion, int integrantes) {
        super(Extencion, integrantes);
        this.poder = poder;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Comarca{" + "poder=" + poder + '}';
    }

}

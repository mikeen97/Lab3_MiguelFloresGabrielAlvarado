/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelfloresgabrielalvarado;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Miguel Flores
 */
public class Hobbits extends Integrantes {

    private ArrayList<Hobbits> ListIntegrantes = new ArrayList();
    private String anillos;

    public Hobbits() {
    }

    public Hobbits(String anillos, String nombre, String apellido, double altura, Date fechaNacimiento, String acompanante, String poderAtaque, String defensa, String curacion) {
        super(nombre, apellido, altura, fechaNacimiento, acompanante, poderAtaque, defensa, curacion);
        this.anillos = anillos;
    }

    public String getAnillos() {
        return anillos;
    }

    public void setAnillos(String anillos) {
        this.anillos = anillos;
    }

    @Override
    public String toString() {
        return "Hobbits{" + "anillos=" + anillos + '}';
    }

}

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
public class maiar extends Integrantes {

    private String arma;

    public maiar() {
    }

    public maiar(String arma, String raza, String nombre, String apellido, double altura, Date fechaNacimiento, String acompanante, int poderAtaque, int defensa, int curacion) {
        super(raza, nombre, apellido, altura, fechaNacimiento, acompanante, poderAtaque, defensa, curacion);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "maiar{" + "arma=" + arma + '}';
    }

}

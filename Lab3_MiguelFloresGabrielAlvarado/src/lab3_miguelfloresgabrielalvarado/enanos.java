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
public class enanos extends Integrantes{
    private String enenoBatalla;
    private String barba;
    private String hacha;

    public enanos() {
    }

    public enanos(String enenoBatalla, String barba, String hacha, String raza, String nombre, String apellido, double altura, Date fechaNacimiento, String acompanante, int poderAtaque, int defensa, int curacion) {
        super(raza, nombre, apellido, altura, fechaNacimiento, acompanante, poderAtaque, defensa, curacion);
        this.enenoBatalla = enenoBatalla;
        this.barba = barba;
        this.hacha = hacha;
    }

 

    public String getEnenoBatalla() {
        return enenoBatalla;
    }

    public void setEnenoBatalla(String enenoBatalla) {
        this.enenoBatalla = enenoBatalla;
    }

    public String getBarba() {
        return barba;
    }

    public void setBarba(String barba) {
        this.barba = barba;
    }

    public String getHacha() {
        return hacha;
    }

    public void setHacha(String hacha) {
        this.hacha = hacha;
    }

    @Override
    public String toString() {
        return "enanos{" + "enenoBatalla=" + enenoBatalla + '}';
    }
    
    
}

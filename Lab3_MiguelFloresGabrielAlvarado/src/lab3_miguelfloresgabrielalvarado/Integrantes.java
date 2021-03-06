/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelfloresgabrielalvarado;

import java.util.Date;

/**
 *
 * @author Miguel Flores
 */
public class Integrantes {

    private String raza;
    private String nombre;
    private String apellido;
    private double altura;
    private Date fechaNacimiento;
    private String acompanante;
    private int poderAtaque;
    private int defensa;
    private int curacion;

    public Integrantes() {
    }

    public Integrantes(String raza, String nombre, String apellido, double altura, Date fechaNacimiento, String acompanante, int poderAtaque, int defensa, int curacion) {
        this.raza = raza;
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.fechaNacimiento = fechaNacimiento;
        this.acompanante = acompanante;
        this.poderAtaque = poderAtaque;
        this.defensa = defensa;
        this.curacion = curacion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAcompanante() {
        return acompanante;
    }

    public void setAcompanante(String acompanante) {
        this.acompanante = acompanante;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }



    @Override
    public String toString() {
        return "Integrantes{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}

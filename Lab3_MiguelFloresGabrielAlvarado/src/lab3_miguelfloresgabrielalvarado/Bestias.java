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
public class Bestias {

    private int Guarras;
    private String veneno;
    private int vida;
    private int curacion;
    private int Ataque;

    public Bestias() {

    }

    public Bestias(int Guarras, String veneno, int vida, int curacion, int Ataque) {
        this.Guarras = Guarras;
        this.veneno = veneno;
        this.vida = vida;
        this.curacion = curacion;
        this.Ataque = Ataque;
    }

    public int getGuarras() {
        return Guarras;
    }

    public void setGuarras(int Guarras) {
        this.Guarras = Guarras;
    }

    public String getVeneno() {
        return veneno;
    }

    public void setVeneno(String veneno) {
        this.veneno = veneno;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    @Override
    public String toString() {
        return "Bestias{" + "Guarras=" + Guarras + ", veneno=" + veneno + ", vida=" + vida + ", curacion=" + curacion + ", Ataque=" + Ataque + '}';
    }

}

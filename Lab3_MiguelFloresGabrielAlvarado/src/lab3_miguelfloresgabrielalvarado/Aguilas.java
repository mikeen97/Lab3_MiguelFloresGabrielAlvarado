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
public class Aguilas extends Bestias {
    private Color color;

    public Aguilas() {
        super();
    }
    

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Aguilas(Color color) {
        this.color = color;
    }

    public Aguilas(Color color, int Guarras, String veneno, int vida, int curacion, int Ataque) {
        super(Guarras, veneno, vida, curacion, Ataque);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Aguilas{" + "color=" + color + '}';
    }
    
    
}

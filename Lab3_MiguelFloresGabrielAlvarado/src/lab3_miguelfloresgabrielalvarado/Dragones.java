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
public class Dragones extends Bestias{
    private int longitud;
    
    public Dragones(){
        super();
    }

    public Dragones(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    

    public Dragones(int longitud, int Guarras, String veneno, int vida, int curacion, int Ataque) {
        super(Guarras, veneno, vida, curacion, Ataque);
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Dragones{" + "longitud=" + longitud + '}';
    }
    
    
}
